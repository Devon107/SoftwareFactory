/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Encapsulamiento.Requerimiento;
import java.util.List;
/**
 *
 * @author reynaldoalfonso
 */
public interface InterfaceRequerimientos {
    public boolean Registrar(Requerimiento requerimiento) throws Exception;
    public List<Requerimiento> GetAll() throws Exception;
    public Requerimiento GetByIdRequerimiento(String IdRequerimiento) throws Exception;
    public boolean Modificar(Requerimiento requerimiento) throws Exception;
    public boolean Eliminar(Requerimiento requerimiento) throws Exception;
    public String GetCantidad() throws Exception;
}
