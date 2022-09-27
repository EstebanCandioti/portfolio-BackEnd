package com.estebancandioti.portfolio.service;


import com.estebancandioti.portfolio.model.Proyecto;
import com.estebancandioti.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    ProyectoRepository proRepo;
    
    @Override
    public void crearProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public List<Proyecto> traerProyectos() {
        return proRepo.findAll();
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public List<Proyecto> traerProyectoPersona(Long id) {
        return proRepo.getProyectoByPersonaId(id);
    }
    
}
