package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.Persona;
import com.portfolio.estebancandioti.repository.PersonaRepository;
import java.util.List;
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
