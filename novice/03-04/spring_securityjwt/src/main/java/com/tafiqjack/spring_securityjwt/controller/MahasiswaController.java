package com.tafiqjack.spring_securityjwt.controller;

import com.tafiqjack.spring_securityjwt.models.Mahasiswa;
import com.tafiqjack.spring_securityjwt.reposoitory.MahasiswaRepo;
import com.tafiqjack.spring_securityjwt.security.service.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


    @RestController
    @RequestMapping("/api/auth/mhs")
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
