/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.estebancandioti.service;

import com.portfolio.estebancandioti.model.HabilidadDebil;
import java.util.List;

/**
 *
 * @author esteban
 */
public interface IHabilidadDebilService {
    
    public void crearHabilidadDebil(HabilidadDebil hab);
    
    public void borrarHabilidadDebil(Long id);
    
    public void editarHabilidadDebil(HabilidadDebil hab);
    
    public HabilidadDebil buscarHabilidadDebil (Long id);
    
    public List<HabilidadDebil> traerHabilidadesDebiles ();
   
    public List<HabilidadDebil> traerHabilidadesDebilesPersona(Long id);
    
}
