package com.taufiqjack.springrelasi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private Long nim;

    @Column
    private String nama_depan;

    @Column
    private String nama_belakang;

    @Column
    private String email;

    // @OneToMany(mappedBy = "matakuliah", cascade = { CascadeType.ALL })
    // private List<MataKuliah> matakuliah;

    public Mahasiswa() {

    }

    public Mahasiswa(long nim, String nama_depan, String nama_belakang, String email) {
        this.nim = nim;
        this.nama_depan = nama_depan;
        this.nama_belakang = nama_belakang;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    public String getNama_depan() {
        return nama_depan;
    }

    public void setNama_depan(String nama_depan) {
        this.nama_depan = nama_depan;
    }

    public String getNama_belakang() {
        return nama_belakang;
    }

    public void setNama_belakang(String nama_belakang) {
        this.nama_belakang = nama_belakang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public List<MataKuliah> getMatakuliah() {
    // return matakuliah;
    // }

    // public void setMatakuliah(List<MataKuliah> matakuliah) {
    // this.matakuliah = matakuliah;
    // }

}