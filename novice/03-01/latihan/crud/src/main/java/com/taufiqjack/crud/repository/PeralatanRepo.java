package com.taufiqjack.crud.repository;

import com.taufiqjack.crud.model.Peralatan;

import org.springframework.data.repository.CrudRepository;

public interface PeralatanRepo extends CrudRepository<Peralatan, Long> {

    // Optional<Peralatan> findById(Long id);
}
