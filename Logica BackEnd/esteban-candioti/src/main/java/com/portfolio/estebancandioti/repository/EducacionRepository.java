package com.portfolio.estebancandioti.repository;

import com.portfolio.estebancandioti.model.Educacion;
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
