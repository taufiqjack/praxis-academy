package com.tafiqjack.spring_securityjwt.reposoitory;

import com.tafiqjack.spring_securityjwt.models.Role;
import com.tafiqjack.spring_securityjwt.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
