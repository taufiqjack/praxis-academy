package com.taufiqjack.springrelasi.repository;

import com.taufiqjack.springrelasi.model.Mahasiswa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MataKuliahRepo
 */
public interface MataKuliahRepo extends JpaRepository<Mahasiswa, Long> {
    // List<Mahasiswa> findByMahasiswaId(Long mahasiswaId);

    // Optional<Mahasiswa> findByIdAndMahasiswaId(Long id, Long mahasiswaId);

}