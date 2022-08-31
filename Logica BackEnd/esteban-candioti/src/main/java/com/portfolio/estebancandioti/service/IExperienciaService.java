package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public void crearExperiencia (Experiencia trab);
    
    public void borrarExperiencia (Long id);
    
    public void editarExperiencia(Experiencia trab);
    
    public Experiencia buscarExperiencia (Long id);
    
    public List<Experiencia> traerExperiencia ();
    
    public List<Experiencia> traerExperienciaPersona(Long id);
}
