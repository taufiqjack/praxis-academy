package com.taufiqjack.springboot_mtom.model;


import com.taufiqjack.springboot_mtom.repository.PasienRepo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dokter")
public class Dokter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long nip;
    private String spesialis;
    private String nama_dokter;

    @ManyToMany(mappedBy = "dokters")
    private Set<Pasien> pasiens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNip() {
        return nip;
    }

    public void setNip(Long nip) {
        this.nip = nip;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }
}
