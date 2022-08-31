package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.Educacion;
import com.portfolio.estebancandioti.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository eduRepo;
    
    @Override
    public void crearEducacion(Educacion est) {
        eduRepo.save(est);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void editarEducacion(Educacion es) {
        eduRepo.save(es);
    }

    @Override
    public List<Educacion> traerEducacion() {
        List<Educacion> lista= eduRepo.findAll();
        return lista;
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public List<Educacion> getEducacionPersona(Long id) {
        return eduRepo.getEducacionByPersonaId(id);
    }
    
}
