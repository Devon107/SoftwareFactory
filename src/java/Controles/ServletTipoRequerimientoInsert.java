/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Negocio.NegocioTipoRequerimiento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author flores
 */
@WebServlet(name = "ServletTipoRequerimientoInsert", urlPatterns = {"/ServletTipoRequerimientoInsert"})
public class ServletTipoRequerimientoInsert extends HttpServlet {
    
    
    private NegocioTipoRequerimiento negociotiporequerimiento;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if(request.getMethod().equals("GET")){
            request.getRequestDispatcher("TipoRequerimientoInsert.jsp").forward(request, response);
        }
        if(request.getMethod().equals("POST")){
            
            String id = String.valueOf(request.getParameter("txtDescripcion").charAt(0));
            id = id + String.valueOf(request.getParameter("txtDescripcion").charAt(1));
            
            negociotiporequerimiento= new NegocioTipoRequerimiento();
            
            negociotiporequerimiento.GetCantidad();
            
            String cantidad = negociotiporequerimiento.getCantidadDatos();
            
            while(cantidad.length() < 3)
            {
                cantidad = "0" + cantidad;
            }
            id = id + cantidad;            
            
            negociotiporequerimiento.getTiporequerimiento().setIdTipoRequerimiento(id.toUpperCase());
            negociotiporequerimiento.getTiporequerimiento().setDescripcion(request.getParameter("txtDescripcion"));
            
            boolean retorno = negociotiporequerimiento.insert();
            request.setAttribute("Resultado", retorno?"Correcto":"Incorrecto");
            request.getRequestDispatcher("TipoRequerimientoResultado.jsp").forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
