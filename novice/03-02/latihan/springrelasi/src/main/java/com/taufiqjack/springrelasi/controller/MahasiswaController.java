package com.taufiqjack.springrelasi.controller;

import com.taufiqjack.springrelasi.exception.ResourceNotFound;
import com.taufiqjack.springrelasi.model.Mahasiswa;
import com.taufiqjack.springrelasi.repository.MahasiswaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.security.BasicPermission;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mhs")
public class MahasiswaController {

    @Autowired
    private MahasiswaRepo mahasiswaRepo;

    @GetMapping(path = "/mahasiswa")
    public Iterable<Mahasiswa> getMahasiswa() {
        return mahasiswaRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Mahasiswa> getInstructorById(@PathVariable(value = "id") Long mahasiswaId)
            throws ResourceNotFound {
        Mahasiswa user = mahasiswaRepo.findById(mahasiswaId)
                .orElseThrow(() -> new ResourceNotFound(" Data Mahasiswa tidak ditemukan :: " + mahasiswaId));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping(path = "/add")
    public Mahasiswa addData(@RequestBody Mahasiswa mahasiswa) {
        return mahasiswaRepo.save(mahasiswa);
    }

    @PutMapping(path = "/edit/{id}")
    public ResponseEntity<Mahasiswa> updateMhs(
            @PathVariable(value = "id") Long mahasiswaId,
            @RequestBody Mahasiswa mhsDetail
    ) throws ResourceNotFound {
        Mahasiswa mahasiswa = mahasiswaRepo.findById(mahasiswaId).orElseThrow(() -> new ResourceNotFound("Mahasiswa tidak ditemukan :: " + mahasiswaId));
        mahasiswa.setNim(mhsDetail.getNim());
        mahasiswa.setNama_depan(mhsDetail.getNama_depan());
        mahasiswa.setNama_belakang(mhsDetail.getNama_belakang());
        mahasiswa.setEmail(mhsDetail.getEmail());
        final Mahasiswa updateMhs = mahasiswaRepo.save(mahasiswa);
        return ResponseEntity.ok(updateMhs);
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deleteMhs(
            @PathVariable(value = "id") Long mahasiswaId)
        throws ResourceNotFound{
        Mahasiswa mahasiswa = mahasiswaRepo.findById(mahasiswaId)
                .orElseThrow(()-> new ResourceNotFound("Mahasiswa tidak ditemukan :: " + mahasiswaId));
        mahasiswaRepo.delete(mahasiswa);
        Map<String, Boolean> response = new HashMap<>();
        response.put("terhapus",Boolean.TRUE);
        return response;
    }

}
