package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controladora = new ControladoraPersistencia();
    
    public void crearProducto (Producto prod){
        controladora.crearProducto(prod);
    }
    
    public void eliminarProducto (Producto prod){
        controladora.eliminarProducto(prod);
    }
    
    public List<Producto> traerProducto (){
        return controladora.traerProducto();
    }
}
