package com.taufiqjack.sisteminformasicatering.repository;

import com.taufiqjack.kasus_jwt.models.Role;
import com.taufiqjack.kasus_jwt.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role>findByName(RoleName roleName);
}
