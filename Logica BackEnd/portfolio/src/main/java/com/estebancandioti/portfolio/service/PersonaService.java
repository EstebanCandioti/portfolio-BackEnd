package com.estebancandioti.portfolio.service;

import com.estebancandioti.portfolio.model.Persona;
import com.estebancandioti.portfolio.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    PersonaRepository perRepo;
    
    @Override
    public void crearPersona(Persona per) {
        perRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        perRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return perRepo.findById(id).orElse(null);
    }

    @Override
    public Persona editarPersona(Persona per) {
        perRepo.save(per);
        return per;
    }
}
