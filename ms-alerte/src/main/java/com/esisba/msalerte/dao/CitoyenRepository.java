package com.esisba.msalerte.dao;

import com.esisba.msalerte.entities.Citoyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CitoyenRepository extends JpaRepository<Citoyen,Long> {
}
