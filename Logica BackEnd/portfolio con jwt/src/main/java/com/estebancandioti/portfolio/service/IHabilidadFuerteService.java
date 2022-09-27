package com.estebancandioti.portfolio.service;


import com.estebancandioti.portfolio.model.HabilidadFuerte;
import java.util.List;

public interface IHabilidadFuerteService {
    
    public void crearHabilidadFuerte(HabilidadFuerte hab);
    
    public void borrarHabilidadFuerte (Long id);
    
    public HabilidadFuerte editarHabilidadFuerte (HabilidadFuerte hab);
    
    public HabilidadFuerte buscarHabilidadFuerte (Long id);
    
    public List<HabilidadFuerte> traerHabilidadesFuertes ();
    
    public List<HabilidadFuerte> traerHabilidadesFuertesPersona(Long id);
}
