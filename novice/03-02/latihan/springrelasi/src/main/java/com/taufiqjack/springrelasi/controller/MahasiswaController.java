package com.taufiqjack.springrelasi.controller;

import com.taufiqjack.springrelasi.model.Mahasiswa;
import com.taufiqjack.springrelasi.repository.MahasiswaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
