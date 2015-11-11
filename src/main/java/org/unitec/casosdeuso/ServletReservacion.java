/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.casosdeuso;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alfonsogalvanmadera
 */
public class ServletReservacion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            DAOReservacion dao=new DAOReservacion();
            
            Cliente c = new Cliente();
            Destino d = new Destino();
            Tarjeta t = new Tarjeta();
            
            c.setNombre("Juan");
            c.setApellidoPaterno("Campos");
            c.setEmail("rapidclimategmail.com");
            d.setCiudad("Huatulco");
            d.setHotel("hotel Bahías Huatulco");
            d.setNumPersonas(2);          
            t.setNombreTarjeta("tarjeta de nómina Banamex ");
            t.setSaldo(120000f);
            t.setNumeroTarjeta(123456789);
            
            dao.guardarReservacion(c,t, d);
            ArrayList<Cliente> clientes=dao.buscarTodos();
            
        } catch (Exception e) {
        }
        
       
    }

}
