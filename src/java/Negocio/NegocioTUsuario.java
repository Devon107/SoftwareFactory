/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DatosTUsuario;
import Encapsulamiento.Usuario;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Montano
 */
@Stateless
public class NegocioTUsuario {

    private Usuario usuario;
    private String cantidadDatos;
    private List<Usuario> listaUsuario;
    private final DatosTUsuario datosTUsuario;
    
    public NegocioTUsuario()
    {
        usuario = new Usuario();
        datosTUsuario = new DatosTUsuario();
    }
    
    public boolean Registrar()
    {
        try 
        {
            datosTUsuario.Registrar(usuario);
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean Modificar()
    {
        try 
        {
            datosTUsuario.Modificar(usuario);
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean Eliminar()
    {
        try 
        {
            datosTUsuario.Eliminar(usuario);
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean GetAll()
    {
        try 
        {
            listaUsuario = datosTUsuario.GetAll();
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean GetById()
    {
        try 
        {
            usuario = datosTUsuario.GetById(usuario.getIdUsuario());
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean GetCantidad()
    {
        try 
        {
            cantidadDatos = datosTUsuario.GetCantidad();
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean Login()
    {
        try 
        {
            usuario = datosTUsuario.Login(usuario.getIdUsuario(), usuario.getContrasenia());
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getCantidadDatos() {
        return cantidadDatos;
    }

    public void setCantidadDatos(String cantidadDatos) {
        this.cantidadDatos = cantidadDatos;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
}
