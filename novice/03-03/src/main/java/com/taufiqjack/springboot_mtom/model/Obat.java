package com.taufiqjack.springboot_mtom.model;

import javax.persistence.*;

@Entity
@Table(name = "obat")
public class Obat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long nip;

    @Column
    private Long dokter_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dokter_id", referencedColumnName = "id",insertable = false,updatable = false)
    private Dokter dokter;

    public Long getDokter_id() {
        return dokter_id;
    }

    public void setDokter_id(Long dokter_id) {
        this.dokter_id = dokter_id;
    }

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

    public String getKode_obat() {
        return kode_obat;
    }

    public void setKode_obat(String kode_obat) {
        this.kode_obat = kode_obat;
    }

    public String getJenis_obat() {
        return jenis_obat;
    }

    public void setJenis_obat(String jenis_obat) {
        this.jenis_obat = jenis_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    private String kode_obat;
    private String jenis_obat;
    private String nama_obat;


}
