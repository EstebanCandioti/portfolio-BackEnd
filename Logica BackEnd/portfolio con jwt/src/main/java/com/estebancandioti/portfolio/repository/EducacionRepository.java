package com.estebancandioti.portfolio.repository;

import com.estebancandioti.portfolio.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
   @Query("SELECT e FROM Educacion e WHERE e.idPersona = :idPersona")
    public List<Educacion> getEducacionByPersonaId(@Param("idPersona") long idPersona );
}
