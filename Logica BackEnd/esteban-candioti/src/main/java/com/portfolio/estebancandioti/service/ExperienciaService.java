package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.Experiencia;
import com.portfolio.estebancandioti.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    ExperienciaRepository exRepo;
    
    @Override
    public void crearExperiencia(Experiencia trab) {
        exRepo.save(trab);
    }

    @Override
    public void borrarExperiencia(Long id) {
        exRepo.deleteById(id);
    }

    @Override
    public void editarExperiencia(Experiencia trab) {
        exRepo.save(trab);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return exRepo.findById(id).orElse(null);
    }

    @Override
    public List<Experiencia> traerExperiencia() {
        return exRepo.findAll();
    }

    @Override
    public List<Experiencia> traerExperienciaPersona(Long id) {
        return exRepo.getExperienciaByPersonaId(id);
    }
    
}
