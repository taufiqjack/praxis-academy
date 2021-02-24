package com.taufiqjack.springboot_mtom.controller;

import com.taufiqjack.springboot_mtom.model.Kasir;
import com.taufiqjack.springboot_mtom.repository.DokterRepo;
import com.taufiqjack.springboot_mtom.repository.KasirRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@RestController
public class KasirController {

    @Autowired
    private KasirRepo kasirRepo;

    @Autowired
    private DokterRepo dokterRepo;

//    @GetMapping("/dokter/{dokterId}/kasir")
//    public List<Kasir> getDokterByKasir(@PathVariable(value = "id_dokter") Long dokterId) {
//        return kasirRepo.findById(dokterId);
//    }
}