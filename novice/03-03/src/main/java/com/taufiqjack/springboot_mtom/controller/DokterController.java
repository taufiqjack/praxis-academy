package com.taufiqjack.springboot_mtom.controller;


import com.taufiqjack.springboot_mtom.model.Dokter;
import com.taufiqjack.springboot_mtom.repository.DokterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rs")
public class DokterController {

    @Autowired
    private DokterRepo dokterRepo;

    @GetMapping(path = "/get")
    public List<Dokter> getDataDokter(){
        return dokterRepo.findAll();
    }

    @PostMapping("/dokter")
    public Dokter createData(@RequestBody Dokter dokter){
        return dokterRepo.save(dokter);
    }

}
