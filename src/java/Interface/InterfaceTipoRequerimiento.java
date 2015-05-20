/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Encapsulamiento.Tiporequerimiento;
import java.util.List;
/**
 *
 * @author flores
 */
public interface InterfaceTipoRequerimiento {
    public boolean insert(Tiporequerimiento tiporequerimiento) throws Exception;
    public List<Tiporequerimiento> getAll() throws Exception;
    public Tiporequerimiento getByIdTipoUsuario(String IdTipoRequerimiento) throws Exception;
    public boolean delete(Tiporequerimiento tiporequerimiento ) throws Exception;
    public boolean update(Tiporequerimiento tiporequerimiento ) throws Exception;
    public String GetCantidad() throws Exception;    
}
