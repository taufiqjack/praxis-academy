package com.taufiqjack.springboot_mtom.repository;

import com.taufiqjack.springboot_mtom.model.Dokter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DokterRepo extends JpaRepository<Dokter,Long> {


}
