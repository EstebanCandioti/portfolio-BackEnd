package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    ProductoJpaController controladoraJpa = new ProductoJpaController();
    
    public void crearProducto (Producto prod){
        controladoraJpa.create(prod);
    }
    
    public void eliminarProducto (Producto prod){
        try {
            controladoraJpa.destroy(prod.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Producto> traerProducto (){
        return controladoraJpa.findProductoEntities();
    }
}
