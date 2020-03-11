package com.esisba.msalerte.dao;

import com.esisba.msalerte.entities.Alerte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlerteRepository extends JpaRepository<Alerte, Long> {
}
