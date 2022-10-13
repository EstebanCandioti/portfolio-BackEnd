package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Producto;


@WebServlet(name = "SvStock", urlPatterns = {"/SvStock"})
public class SvStock extends HttpServlet {
    
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession miSession = request.getSession();
        
        List<Producto> listaStock = control.traerProducto();
        miSession.setAttribute("listaStock", listaStock);
        
        response.sendRedirect("mostrarStock.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String nombre = request.getParameter("nombre");
        String costo = request.getParameter("costo");
        String venta= request.getParameter("venta");
        
        Producto prod= new Producto (0,nombre,costo,venta);
        control.crearProducto(prod);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
