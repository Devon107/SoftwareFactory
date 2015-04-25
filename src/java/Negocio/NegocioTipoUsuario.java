/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DatosTipoUsuario;
import Encapsulamiento.Tipousuario;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author reynaldoalfonso
 */
@Stateless
public class NegocioTipoUsuario {
    private Tipousuario tipousuario;
    private String cantidadDatos;
    private List<Tipousuario> listaTipoUsuario;
    private final DatosTipoUsuario datatipousuario;
    
    public NegocioTipoUsuario(){
         tipousuario= new Tipousuario();
         datatipousuario=new DatosTipoUsuario();
         
    }
    public boolean insert(){
        try{
            datatipousuario.insert(tipousuario);
            return true;
        }catch(Exception ex){
          out.println(ex.getMessage());
          return false;
        }
    }
    public boolean update(){
        try{
            datatipousuario.update(tipousuario);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean delete(){
        try{
            datatipousuario.delete(tipousuario);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean getAll(){
        try{
            listaTipoUsuario= datatipousuario.getAll();
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean GetCantidad()
    {
        try 
        {
            cantidadDatos = datatipousuario.GetCantidad();
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean getByIdTipoUsuario(){
        try{
            tipousuario= datatipousuario.getByIdTipoUsuario(tipousuario.getIdTipoUsuario());
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    } 
    public Tipousuario getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(Tipousuario tipousuario) {
        this.tipousuario = tipousuario;
    }
    
    public String getCantidadDatos() {
        return cantidadDatos;
    }

    public void setCantidadDatos(String cantidadDatos) {
        this.cantidadDatos = cantidadDatos;
    }

    public List<Tipousuario> getListaTipoUsuario() {
        return listaTipoUsuario;
    }

    public void setListaTipoUsuario(List<Tipousuario> listaTipoUsuario) {
        this.listaTipoUsuario = listaTipoUsuario;
    }
    
    
}
