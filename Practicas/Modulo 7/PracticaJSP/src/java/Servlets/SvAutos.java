/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.Auto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvAutos", urlPatterns = {"/SvAutos"})
public class SvAutos extends HttpServlet {
    List<Auto> listaAutos = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession miSession = request.getSession();
        
        miSession.setAttribute("listaAutos", listaAutos);
        response.sendRedirect("mostrarAutos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String patente=request.getParameter("patente");
        String marca=request.getParameter("marca");
        String modelo=request.getParameter("modelo");
        String color= request.getParameter("color");
        String motor= request.getParameter("motor");
        
        listaAutos.add(new Auto(patente,marca,modelo,color,motor));
                
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
