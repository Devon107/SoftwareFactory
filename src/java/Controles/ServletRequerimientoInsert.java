/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Encapsulamiento.Tiporequerimiento;
import Negocio.NegocioRequerimiento;
import Negocio.NegocioTipoRequerimiento;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author reynaldoalfonso
 */
@WebServlet(name = "ServletRequerimientoInsert", urlPatterns = {"/ServletRequerimientoInsert"})
public class ServletRequerimientoInsert extends HttpServlet {
    
    @EJB
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
        if(request.getMethod().equals("GET"))
        {
            negociotiporequerimiento= new NegocioTipoRequerimiento();
            negociotiporequerimiento.getAll();
            
            request.setAttribute("negociotiporequerimiento", negociotiporequerimiento);  
            request.getRequestDispatcher("RequerimientoInsert.jsp").forward(request, response);
        }
        
        if(request.getMethod().equals("POST"))
        {
            negociorequerimiento= new NegocioRequerimiento();
            Tiporequerimiento tiporequerimiento = new Tiporequerimiento();
            tiporequerimiento.setIdTipoRequerimiento(request.getParameter("cmbTipoRequerimiento"));
            
            String id = String.valueOf(request.getParameter("txtNombre").charAt(0));
            id = id + String.valueOf(request.getParameter("txtNombre").charAt(1));
            id = id + String.valueOf(request.getParameter("cmbTipoRequerimiento").charAt(0));
            id = id + String.valueOf(request.getParameter("cmbTipoRequerimiento").charAt(1));
            id = id.toUpperCase();
            
            negociorequerimiento.GetCantidad();            
            String cantidad = negociorequerimiento.getCantidadDatos();
            
            while(cantidad.length() < 4)
            {
                cantidad = "0" + cantidad;
            }
            id = id + cantidad;     
            
            BigDecimal bd= new BigDecimal(request.getParameter("txtCosto"));
            negociorequerimiento.getRequerimiento().setIdRequerimiento(id);
            negociorequerimiento.getRequerimiento().setNombre(request.getParameter("txtNombre"));
            negociorequerimiento.getRequerimiento().setCosto(bd);
            negociorequerimiento.getRequerimiento().setHorasHombre(Integer.parseInt(request.getParameter("txtHorasHombre")));
            negociorequerimiento.getRequerimiento().setDescripcion(request.getParameter("txtDescripcion"));
            negociorequerimiento.getRequerimiento().setTiporequerimiento(tiporequerimiento);
            boolean retorno = negociorequerimiento.Registrar();
            
            request.setAttribute("Resultado", retorno?"Correcto":"Incorrecto");
            
            request.getRequestDispatcher("RequerimientoResultado.jsp").forward(request, response);
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
