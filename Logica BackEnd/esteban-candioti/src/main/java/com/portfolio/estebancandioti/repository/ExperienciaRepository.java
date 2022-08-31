package com.portfolio.estebancandioti.repository;

import com.portfolio.estebancandioti.model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    @Query("SELECT e FROM Experiencia e WHERE e.idPersona = :idPersona")
    public List<Experiencia> getExperienciaByPersonaId(@Param("idPersona") long idPersona );
}
