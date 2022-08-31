package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.Persona;

public interface IPersonaService {
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
    public Persona editarPersona(Persona per);
}
