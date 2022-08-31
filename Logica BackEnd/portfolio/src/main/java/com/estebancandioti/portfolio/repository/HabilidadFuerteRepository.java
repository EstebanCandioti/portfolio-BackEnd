package com.estebancandioti.portfolio.repository;



import com.estebancandioti.portfolio.model.HabilidadFuerte;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadFuerteRepository extends JpaRepository<HabilidadFuerte,Long>{
               @Query("SELECT e FROM HabilidadFuerte e WHERE e.idPersona = :idPersona")
    public List<HabilidadFuerte> getHabilidadFuerteByPersonaId(@Param("idPersona") long idPersona );
}
