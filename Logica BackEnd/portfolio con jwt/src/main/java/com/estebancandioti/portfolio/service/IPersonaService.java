package com.estebancandioti.portfolio.service;

import com.estebancandioti.portfolio.model.Persona;

public interface IPersonaService {
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
    public Persona editarPersona(Persona per);
}
