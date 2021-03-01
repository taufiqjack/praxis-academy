package com.tafiqjack.spring_securityjwt.models;

import javax.persistence.*;

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
}
