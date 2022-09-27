package com.estebancandioti.portfolio.service;

import com.estebancandioti.portfolio.model.Tecnologia;
import com.estebancandioti.portfolio.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{

    @Autowired
    TecnologiaRepository tecRepo;
    
    @Override
    public void crearTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }

    @Override
    public void borrarTecnologia(Long id) {
        tecRepo.deleteById(id);
    }

    @Override
    public Tecnologia editarTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
        return tec;
    }

    @Override
    public Tecnologia buscarTecnologia(Long id) {
        return tecRepo.findById(id).orElse(null);
    }

    @Override
    public List<Tecnologia> traerTecnologias() {
        return tecRepo.findAll();
    }

    @Override
    public List<Tecnologia> traerTecnologiaPersona(Long id) {
       return tecRepo.getTecnologiaByPersonaId(id);
    }
    
}
