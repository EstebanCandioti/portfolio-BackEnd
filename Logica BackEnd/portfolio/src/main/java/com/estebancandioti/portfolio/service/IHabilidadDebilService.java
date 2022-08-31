package com.estebancandioti.portfolio.service;

import com.estebancandioti.portfolio.model.HabilidadDebil;
import java.util.List;


public interface IHabilidadDebilService {
    
    public void crearHabilidadDebil(HabilidadDebil hab);
    
    public void borrarHabilidadDebil(Long id);
    
    public void editarHabilidadDebil(HabilidadDebil hab);
    
    public HabilidadDebil buscarHabilidadDebil (Long id);
    
    public List<HabilidadDebil> traerHabilidadesDebiles ();
   
    public List<HabilidadDebil> traerHabilidadesDebilesPersona(Long id);
    
}
