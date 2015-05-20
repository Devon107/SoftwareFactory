/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Negocio.NegocioRequerimiento;
import Negocio.NegocioTipoRequerimiento;
import java.math.BigDecimal;
/**
 *
 * @author reynaldoalfonso
 */
@WebServlet(name = "ServletRequerimientoUpdate", urlPatterns = {"/ServletRequerimientoUpdate"})
public class ServletRequerimientoUpdate extends HttpServlet {
    NegocioRequerimiento negociorequerimiento;
    NegocioTipoRequerimiento negociotiporequerimiento;
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
            negociotiporequerimiento= new NegocioTipoRequerimiento();
            negociotiporequerimiento.getAll();
            
            request.setAttribute("negociotiporequerimiento", negociotiporequerimiento); 
            negociorequerimiento= new NegocioRequerimiento();
            negociorequerimiento.getRequerimiento().setIdRequerimiento(request.getParameter("id"));
            negociorequerimiento.GetById();
            request.setAttribute("negociorequerimiento", negociorequerimiento);
            request.getRequestDispatcher("RequerimientoUpdate.jsp").forward(request, response);
        }
        if(request.getMethod().equals("POST")){
            negociorequerimiento= new NegocioRequerimiento();
             
            BigDecimal bd= new BigDecimal(request.getParameter("txtCosto"));
            negociorequerimiento.getRequerimiento().setIdRequerimiento("txtIdRequerimiento");
            negociorequerimiento.getRequerimiento().setNombre(request.getParameter("txtNombre"));
            negociorequerimiento.getRequerimiento().setCosto(bd);
            negociorequerimiento.getRequerimiento().setHorasHombre(Integer.parseInt(request.getParameter("txtHorasHombre")));
            negociorequerimiento.getRequerimiento().setDescripcion(request.getParameter("txtDescripcion"));
            
            boolean retorno = negociorequerimiento.update();
            request.setAttribute("Resultado", retorno?"Correcto":"Incorrecto");
            request.getRequestDispatcher("TipoUsuarioResultado.jsp").forward(request, response);
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
