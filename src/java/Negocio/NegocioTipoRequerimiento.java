/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DatosTipoRequerimiento;
import Encapsulamiento.Tiporequerimiento;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author flores
 */
public class NegocioTipoRequerimiento  {
    private Tiporequerimiento tiporequerimiento;
    private String cantidadDatos;
    private List<Tiporequerimiento> listaTipoRequerimiento;
    private final DatosTipoRequerimiento datatiporequerimiento;
    
    public NegocioTipoRequerimiento(){
         tiporequerimiento= new Tiporequerimiento();
         datatiporequerimiento=new DatosTipoRequerimiento();
         
    }
    public boolean insert(){
        try{
            datatiporequerimiento.insert(tiporequerimiento);
            return true;
        }catch(Exception ex){
          out.println(ex.getMessage());
          return false;
        }
    }
    public boolean update(){
        try{
            datatiporequerimiento.update(tiporequerimiento);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean delete(){
        try{
            datatiporequerimiento.delete(tiporequerimiento);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean getAll(){
        try{
            listaTipoRequerimiento= datatiporequerimiento.getAll();
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
            cantidadDatos = datatiporequerimiento.GetCantidad();
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean getByIdTipoRequerimiento(){
        try{
            tiporequerimiento= datatiporequerimiento.getByIdTipoRequerimiento(tiporequerimiento.getIdTipoRequerimiento());
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    } 
    public Tiporequerimiento getTiporequerimiento() {
        return tiporequerimiento;
    }

    public void setTiporequerimiento(Tiporequerimiento tiporequerimiento) {
        this.tiporequerimiento = tiporequerimiento;
    }
    
    public String getCantidadDatos() {
        return cantidadDatos;
    }

    public void setCantidadDatos(String cantidadDatos) {
        this.cantidadDatos = cantidadDatos;
    }

    public List<Tiporequerimiento> getListaTipoRequerimiento() {
        return listaTipoRequerimiento;
    }

    public void setListaTipoRequerimiento(List<Tiporequerimiento> listaTipoRequerimiento) {
        this.listaTipoRequerimiento = listaTipoRequerimiento;
    }
    
    
}
