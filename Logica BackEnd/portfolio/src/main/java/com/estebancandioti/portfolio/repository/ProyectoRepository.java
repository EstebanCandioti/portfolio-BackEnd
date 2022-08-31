package com.estebancandioti.portfolio.repository;

import com.estebancandioti.portfolio.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long>{
        @Query("SELECT e FROM Proyecto e WHERE e.idPersona = :idPersona")
    public List<Proyecto> getProyectoByPersonaId(@Param("idPersona") long idPersona );
}
