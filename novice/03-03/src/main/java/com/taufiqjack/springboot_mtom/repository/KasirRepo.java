package com.taufiqjack.springboot_mtom.repository;

import com.taufiqjack.springboot_mtom.model.Kasir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaEntityGraph;
import org.springframework.stereotype.Repository;

@Repository
public interface KasirRepo extends JpaRepository<Kasir, Long> {
}
