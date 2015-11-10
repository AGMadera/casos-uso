/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.casosdeuso;

import java.util.ArrayList;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author alfonsogalvanmadera
 */
public class DAOReservacion {
    private static SessionFactory sesionFactory;
    private static Session sesion;
    private static Transaction tranza;
    
    public DAOReservacion(){
        sesionFactory=HibernateUtilidades.getSessionFactory();
        sesion=sesionFactory.openSession();
        tranza=sesion.beginTransaction();  
    }
    
    public void cerrarTodo(){
        tranza.commit();
        sesion.close();
    }
    
    public void guardarReservacion(Cliente c,Destino d, Tarjeta t)throws Exception{
        sesion.save(c);
        sesion.save(d);
        sesion.save(t);
        cerrarTodo();
    }
    
    
   public ArrayList<Cliente> buscarTodos()throws Exception{
        ArrayList<Cliente> clientesuchos=( ArrayList<Cliente>)sesion.createCriteria(Cliente.class).list();
        cerrarTodo();
        return clientesuchos;
    }
    /*
   public ArrayList<Reservacion> buscarTodosRe()throws Exception{
        ArrayList<Reservacion> reserva=( ArrayList<Reservacion>)sesion.createCriteria(Reservacion.class).list();
        cerrarTodo();
        return reserva;
    }
   */
   
   public Cliente buscarPorId (Integer id)throws Exception{
        Cliente a=(Cliente) sesion.createCriteria(Cliente.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTodo();
        return a;
    }
     
}
