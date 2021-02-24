package com.taufiqjack.springrelasi.controller;

import java.util.List;
import com.taufiqjack.springrelasi.model.MataKuliah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class MataKuliahController {

    @Autowired
    private MataKuliah mataKuliahRepo;

    // @Autowired
    // private MahasiswaRepo mahasiswaRepo;

    @GetMapping(path = "/mahasiswa/{id}/matakuliah")
    public List<MataKuliah> getMakulByMahasiswa(@PathVariable(value = "id") Long mahasiswaId) {
        return mataKuliahRepo.findByMahasiswaId(mahasiswaId);
    }

    // @PostMapping(path ="/add" )
    // public MataKuliah crateMakul(@RequestBody MataKuliah mataKuliah){
    // return mataKuliahRepo.save(mataKuliah);
    // }

}