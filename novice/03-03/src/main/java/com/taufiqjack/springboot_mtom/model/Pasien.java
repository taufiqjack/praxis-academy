package com.taufiqjack.springboot_mtom.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pasien")
public class Pasien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nama;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }

    public Long getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(Long id_pasien) {
        this.id_pasien = id_pasien;
    }

    private String alamat;
    private String no_hp;
    private String gejala;

    private Long id_pasien;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "dokter", joinColumns =  @JoinColumn(name = "id_pasien"),inverseJoinColumns = @JoinColumn(name = "id_dokter"))
    private Set<Dokter> dokters;
}
