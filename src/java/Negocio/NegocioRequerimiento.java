/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Datos.DatosRequerimiento;
import Encapsulamiento.Requerimiento;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;
/**
 *
 * @author reynaldoalfonso
 */
@Stateless
public class NegocioRequerimiento {
    private String cantidadDatos;
    private Requerimiento requerimiento;    
    private List<Requerimiento> listaRequerimiento;
    private final DatosRequerimiento datosRequerimiento;
    
    public NegocioRequerimiento(){
        requerimiento= new Requerimiento();
        datosRequerimiento= new DatosRequerimiento();
    }
    
    public boolean Registrar()
    {
        try 
        {
            datosRequerimiento.Registrar(requerimiento);
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * @return the requerimiento
     */
    public Requerimiento getRequerimiento() {
        return requerimiento;
    }

    /**
     * @param requerimiento the requerimiento to set
     */
    public void setRequerimiento(Requerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    /**
     * @return the listaRequerimiento
     */
    public List<Requerimiento> getListaRequerimiento() {
        return listaRequerimiento;
    }

    /**
     * @param listaRequerimiento the listaRequerimiento to set
     */
    public void setListaRequerimiento(List<Requerimiento> listaRequerimiento) {
        this.listaRequerimiento = listaRequerimiento;
    }
    
    public boolean GetAll()
    {
        try 
        {
            listaRequerimiento= datosRequerimiento.GetAll();
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
            cantidadDatos = datosRequerimiento.GetCantidad();
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public String getCantidadDatos() {
        return cantidadDatos;
    }

    public void setCantidadDatos(String cantidadDatos) {
        this.cantidadDatos = cantidadDatos;
    }
    
     public boolean GetById()
    {
        try 
        {
            requerimiento = datosRequerimiento.GetByIdRequerimiento(requerimiento.getIdRequerimiento());
            return true;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean update(){
        try{
            datosRequerimiento.Modificar(requerimiento);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
}
