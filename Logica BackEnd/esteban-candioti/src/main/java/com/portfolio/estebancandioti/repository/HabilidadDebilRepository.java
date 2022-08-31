package com.portfolio.estebancandioti.repository;

import com.portfolio.estebancandioti.model.HabilidadDebil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadDebilRepository extends JpaRepository<HabilidadDebil,Long>{
    @Query("SELECT e FROM HabilidadDebil e WHERE e.idPersona = :idPersona")
    public List<HabilidadDebil> getHabilidadDebilByPersonaId(@Param("idPersona") long idPersona);
}
