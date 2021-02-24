package com.taufiqjack.springrelasi.repository;

import com.taufiqjack.springrelasi.model.Mahasiswa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Long> {

}
