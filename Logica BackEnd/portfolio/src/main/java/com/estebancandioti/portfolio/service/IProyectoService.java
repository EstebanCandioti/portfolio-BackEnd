package com.estebancandioti.portfolio.service;


import com.estebancandioti.portfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public void crearProyecto(Proyecto pro);
    
    public void borrarProyecto (Long id);
    
    public void editarProyecto (Proyecto pro);
    
    public List<Proyecto> traerProyectos ();
    
    public Proyecto buscarProyecto (Long id);
    
    public List<Proyecto> traerProyectoPersona(Long id);
}
