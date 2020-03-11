package com.esisba.mscommissariat.dao;

import com.esisba.mscommissariat.entities.Commissariat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommissariatRepository extends JpaRepository<Commissariat, Long> {
}
