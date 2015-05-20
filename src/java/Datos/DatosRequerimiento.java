/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Encapsulamiento.Requerimiento;
import HibernateUtil.HibernateUtil;
import Interface.InterfaceRequerimientos;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author reynaldoalfonso
 */
public class DatosRequerimiento implements InterfaceRequerimientos{
    Session sesion;

    @Override
    public boolean Registrar(Requerimiento requerimiento) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.save(requerimiento);
        transaccion.commit();
        sesion.close();
        return true;
    }

    @Override
    public List<Requerimiento> GetAll() throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        Query query = sesion.createQuery("From Requerimiento");
        List<Requerimiento> listaRequerimientos = (List<Requerimiento>) query.list();
        transaccion.commit();
        sesion.close();
        return listaRequerimientos;
    }

    @Override
    public Requerimiento GetByIdRequerimiento(String IdRequerimiento) throws Exception {
        sesion=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=sesion.beginTransaction();
        Requerimiento requerimiento= (Requerimiento)sesion.get(Requerimiento.class, IdRequerimiento);
        trasaccion.commit();
        sesion.close();
        return requerimiento;
    }

    @Override
    public boolean Modificar(Requerimiento requerimiento) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.update(requerimiento);
        transaccion.commit();
        sesion.close();
        return true;    
    }
    

    @Override
    public boolean Eliminar(Requerimiento requerimiento) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.delete(requerimiento);
        transaccion.commit();
        sesion.close();
        return true;    
    }

    @Override
    public String GetCantidad() throws Exception {
        sesion=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= sesion.beginTransaction();
        Query query=sesion.createQuery("select count(U)+1 From Requerimiento U");
        String cantidad = String.valueOf(query.uniqueResult());
        transaction.commit();
        sesion.close();
        return cantidad;    
    }
    
}
