package com.estebancandioti.portfolio.service;

import com.estebancandioti.portfolio.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {
    public void crearTecnologia (Tecnologia tec);
    
    public void borrarTecnologia (Long id);
    
    public Tecnologia editarTecnologia (Tecnologia tec);
    
    public Tecnologia buscarTecnologia (Long id);
    
    public List<Tecnologia> traerTecnologias ();
    
    public List<Tecnologia> traerTecnologiaPersona(Long id);
}
