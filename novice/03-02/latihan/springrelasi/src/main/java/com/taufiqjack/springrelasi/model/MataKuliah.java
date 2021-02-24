package com.taufiqjack.springrelasi.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matakuliah")
public class MataKuliah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id_mahasiswa;

    @Column
    private String nama;

    @ManyToOne
    @JoinColumn(name = "id_mahasiswa", referencedColumnName = "id", insertable = false, updatable = false)
    private Mahasiswa mahasiswa;

    public MataKuliah() {

    }

    public MataKuliah(String nama) {
        this.nama = nama;
    }

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

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    @Override
    public String toString() {
        return "Mata Kuliah [id=" + id + ", nama = " + nama + "]";
    }

    public List<MataKuliah> findByMahasiswaId(Long mahasiswaId) {
        return null;
    }

    public Long getId_mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_mahasiswa(Long id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

}
