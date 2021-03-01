package com.tafiqjack.spring_securityjwt.reposoitory;

import com.tafiqjack.spring_securityjwt.models.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Long> {

}
