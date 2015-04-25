/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Encapsulamiento.Tipousuario;
import HibernateUtil.HibernateUtil;
import Interface.InterfaceTipoUsuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author reynaldoalfonso
 */
public class DatosTipoUsuario implements InterfaceTipoUsuario  {
    Session session;
    @Override
    public boolean insert(Tipousuario tipousuario) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion=session.beginTransaction();
        session.save(tipousuario);
        transaccion.commit();
        session.close();
        return true;
    }

    @Override
    public List<Tipousuario> getAll() throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        Query query=session.createQuery("From Tipousuario");//From es para el POJO
        List<Tipousuario> listaTipoUsuario=(List<Tipousuario>)query.list();
        trasaccion.commit();
        session.close();
        return listaTipoUsuario;
    }

    @Override
    public Tipousuario getByIdTipoUsuario(String IdTipoUsuario) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        Tipousuario tipousuario= (Tipousuario)session.get(Tipousuario.class, IdTipoUsuario);
        trasaccion.commit();
        session.close();
        return tipousuario;
        
    }

    @Override
    public boolean delete(Tipousuario tipousuario) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        session.delete(tipousuario);
        trasaccion.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Tipousuario tipousuario) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction trasaccion=session.beginTransaction();
        session.update(tipousuario);
        trasaccion.commit();
        session.close();
        return true;
    }
    
    @Override
    public String GetCantidad() throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        Query query=session.createQuery("select count(TU)+1 From Tipousuario TU");
        String cantidad = String.valueOf(query.uniqueResult());
        transaction.commit();
        session.close();
        return cantidad;
    }
    
}
