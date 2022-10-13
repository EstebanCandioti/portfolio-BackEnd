
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    public void crearPersona (Persona per){
        controlPersis.crearPersona(per);
    }
    
    public void eliminarPersona (int id){
        controlPersis.eliminarPersona(id);
    }
    
    public void eliminarPersona (Persona pers){
        controlPersis.eliminarPersona(pers);
    }
    
     public List<Persona> traerPersonas(){
        return controlPersis.traerPersonas();
    }
     
    public void editarPersonar (Persona pers){
        controlPersis.editarPersona(pers);
    }
    
    public Persona encontrarPersona (Persona pers){
        return controlPersis.encontrarPersona(pers.getId());
    }
}
