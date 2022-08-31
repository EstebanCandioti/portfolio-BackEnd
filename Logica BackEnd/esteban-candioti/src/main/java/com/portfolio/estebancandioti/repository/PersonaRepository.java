package com.portfolio.estebancandioti.repository;

import com.portfolio.estebancandioti.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    
}
