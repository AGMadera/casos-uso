/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.casosdeuso;

/**
 *
 * @author alfonsogalvanmadera
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        DAOReservacion dao=new DAOReservacion();
            
            Cliente c = new Cliente();
            Destino d = new Destino();
            Tarjeta t = new Tarjeta();
            
            c.setNombre("Alfonso");
            c.setApellidoPaterno("Madera");
            c.setEmail("agmadera@proton.com");
            d.setIdCliente(c);          
            d.setCiudad("Huatulco");
            d.setHotel("hotel Bahías Huatulco");
            d.setNumPersonas(2);  
            t.setIdCliente(c);
            t.setNombreTarjeta("tarjeta de nómina Banamex ");
            t.setSaldo(120000f);
            t.setNumeroTarjeta(123456789);
            
            dao.guardarReservacion(c,t, d);
            System.out.println("Se guardo:");
    }
    
}
