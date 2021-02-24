package com.taufiqjack.springboot_mtom.model;

import javax.persistence.*;

@Entity
@Table(name = "kasir")
public class Kasir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long kode_pembayaran;
    private Float jumlah_pemabayaran;
    private Long id_kasir;

    public Long getId_kasir() {
        return id_kasir;
    }

    public void setId_kasir(Long id_kasir) {
        this.id_kasir = id_kasir;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_kasir",referencedColumnName = "id", insertable = false, updatable = false)
    private  Obat obat;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKode_pembayaran() {
        return kode_pembayaran;
    }

    public void setKode_pembayaran(Long kode_pembayaran) {
        this.kode_pembayaran = kode_pembayaran;
    }

    public Float getJumlah_pemabayaran() {
        return jumlah_pemabayaran;
    }

    public void setJumlah_pemabayaran(Float jumlah_pemabayaran) {
        this.jumlah_pemabayaran = jumlah_pemabayaran;
    }
}
