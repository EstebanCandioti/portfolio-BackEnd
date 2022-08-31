package com.estebancandioti.portfolio.service;


import com.estebancandioti.portfolio.model.HabilidadDebil;
import com.estebancandioti.portfolio.repository.HabilidadDebilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadDebilService implements IHabilidadDebilService{

    @Autowired
    HabilidadDebilRepository habRepo;
    
    @Override
    public void crearHabilidadDebil(HabilidadDebil hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidadDebil(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public void editarHabilidadDebil(HabilidadDebil hab) {
        habRepo.save(hab);
    }

    @Override
    public HabilidadDebil buscarHabilidadDebil(Long id) {
        return habRepo.findById(id).orElse(null);
    }


    @Override
    public List<HabilidadDebil> traerHabilidadesDebiles() {
        return habRepo.findAll();
    }

    @Override
    public List<HabilidadDebil> traerHabilidadesDebilesPersona(Long id) {
        return habRepo.getHabilidadDebilByPersonaId(id);
    }
    
}
