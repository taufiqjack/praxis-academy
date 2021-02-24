package com.taufiqjack.springboot_mtom.repository;

import com.taufiqjack.springboot_mtom.model.Obat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObatRepo extends JpaRepository<Obat, Long> {

}
