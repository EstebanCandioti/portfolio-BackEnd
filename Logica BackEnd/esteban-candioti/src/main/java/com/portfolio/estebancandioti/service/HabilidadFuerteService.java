package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.HabilidadFuerte;
import com.portfolio.estebancandioti.repository.HabilidadFuerteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadFuerteService implements IHabilidadFuerteService{

    @Autowired
     HabilidadFuerteRepository habRepo;
    
    @Override
    public void crearHabilidadFuerte(HabilidadFuerte hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidadFuerte(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public HabilidadFuerte editarHabilidadFuerte(HabilidadFuerte hab) {
        habRepo.save(hab);
        return hab;
    }

    @Override
    public HabilidadFuerte buscarHabilidadFuerte(Long id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public List<HabilidadFuerte> traerHabilidadesFuertes() {
        return habRepo.findAll();
    }

    @Override
    public List<HabilidadFuerte> traerHabilidadesFuertesPersona(Long id) {
        return habRepo.getHabilidadFuerteByPersonaId(id);
    }
    
}
