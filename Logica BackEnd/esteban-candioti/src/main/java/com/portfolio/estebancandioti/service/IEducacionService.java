package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.Educacion;
import java.util.List;

public interface IEducacionService {

    public void crearEducacion(Educacion est);

    public void borrarEducacion(Long id);

    public void editarEducacion(Educacion es);

    public List<Educacion> traerEducacion();

    public Educacion buscarEducacion(Long id);
    
    public List<Educacion> getEducacionPersona (Long id);
}
