package com.taufiqjack.springboot_mtom.repository;

import com.taufiqjack.springboot_mtom.model.Pasien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasienRepo extends JpaRepository<Pasien, Long> {

}
