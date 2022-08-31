package com.portfolio.estebancandioti.repository;


import com.portfolio.estebancandioti.model.Tecnologia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia,Long>{
    @Query("SELECT e FROM Tecnologia e WHERE e.idPersona = :idPersona")
    public List<Tecnologia> getTecnologiaByPersonaId(@Param("idPersona") long idPersona );
}
