/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Usuario;
import HibernateUtil.HibernateUtil;
import Interface.InterfaceDatosTPersona;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Montano
 */
public class DatosTUsuario implements InterfaceDatosTPersona{

    Session sesion;
    
    @Override
    public boolean Registrar(Usuario usuario) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.save(usuario);
        transaccion.commit();
        sesion.close();
        return true;
    }

    @Override
    public List<Usuario> GetAll() throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        Query query = sesion.createQuery("From Usuario");
        List<Usuario> listaUsuario = (List<Usuario>) query.list();
        transaccion.commit();
        sesion.close();
        return listaUsuario;
    }

    @Override
    public Usuario GetById(String id) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        //Usuario usuario = (Usuario) sesion.get(Usuario.class, id);
        Query query = sesion.createQuery("From Usuario U where U.idUsuario=:id");
        query.setParameter("id", id);
        Usuario usuario = (Usuario) query.uniqueResult();
        transaccion.commit();
        sesion.close();
        return usuario;
    }

    @Override
    public boolean Modificar(Usuario usuario) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.update(usuario);
        transaccion.commit();
        sesion.close();
        return true;
    }

    @Override
    public boolean Eliminar(Usuario usuario) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.delete(usuario);
        transaccion.commit();
        sesion.close();
        return true;
    }

    @Override
    public Usuario Login(String userName, byte[] password) throws Exception {
        sesion=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= sesion.beginTransaction();
        Query query=sesion.createQuery("From Usuario U where U.idUsuario=:userName AND U.contrasenia=:password ");
        query.setParameter("userName",userName);
        query.setParameter("password",password);
        Usuario usuario = (Usuario) query.uniqueResult();
        transaction.commit();
        sesion.close();
        return usuario;
    }
    
}
