/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Tiporequerimiento;
import HibernateUtil.HibernateUtil;
import Interface.InterfaceTipoRequerimiento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author flores
 */
public class DatosTipoRequerimiento {
    Session session;
    //@Override
    public boolean insert(Tiporequerimiento tiporequerimiento) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion=session.beginTransaction();
        session.save(tiporequerimiento);
        transaccion.commit();
        session.close();
        return true;
    }


    public List<Tiporequerimiento> getAll() throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        Query query=session.createQuery("From Tiporequerimiento");//From es para el POJO
        List<Tiporequerimiento> listaTipoRequerimiento=(List<Tiporequerimiento>)query.list();
        trasaccion.commit();
        session.close();
        return listaTipoRequerimiento;
    }

    public Tiporequerimiento getByIdTipoRequerimiento(String IdTipoRequerimiento) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        Tiporequerimiento tiporequerimiento= (Tiporequerimiento)session.get(Tiporequerimiento.class, IdTipoRequerimiento);
        trasaccion.commit();
        session.close();
        return tiporequerimiento;
        
    }


    public boolean delete(Tiporequerimiento tiporequerimiento) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        session.delete(tiporequerimiento);
        trasaccion.commit();
        session.close();
        return true;
    }


    public boolean update(Tiporequerimiento tiporequerimiento) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        session.update(tiporequerimiento);
        trasaccion.commit();
        session.close();
        return true;
    }
    

    public String GetCantidad() throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        Query query=session.createQuery("select count(TU)+1 From Tiporequerimiento TU");
        String cantidad = String.valueOf(query.uniqueResult());
        transaction.commit();
        session.close();
        return cantidad;
    }
    
}
