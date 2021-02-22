package com.taufiqjack.crud.controller;

import java.util.Optional;

import com.taufiqjack.crud.model.Peralatan;
import com.taufiqjack.crud.repository.PeralatanRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(path = "/alat")
public class PeralatanController {
    @Autowired
    private PeralatanRepo peralatanRepo;

    @PostMapping(path = "/add")
    public Peralatan addAlat(@RequestBody Peralatan peralatan) {
        return peralatanRepo.save(peralatan);
    }

    @GetMapping(path = "/get")
    public Iterable<Peralatan> getAll() {
        return peralatanRepo.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public Optional<Peralatan> idAlat(@PathVariable Long id) {
        return peralatanRepo.findById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteData(@PathVariable Long id) {
        peralatanRepo.deleteById(id);
    }

    @PutMapping(path = "/update/{id}")
    public Peralatan updateData(@RequestBody Peralatan newAlat, @PathVariable Long id) {
        return peralatanRepo.findById(id).map(peralatan -> {
            peralatan.setNama(newAlat.getNama());
            peralatan.setHarga(newAlat.getHarga());
            return peralatanRepo.save(peralatan);
        }).orElseGet(() -> {
            newAlat.setId(id);
            return peralatanRepo.save(newAlat);
        });
    }
}
