/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Encapsulamiento.Tipousuario;
import java.util.List;

/**
 *
 * @author reynaldoalfonso
 */
public interface InterfaceTipoUsuario {
    public boolean insert(Tipousuario tipousuario) throws Exception;
    public List<Tipousuario> getAll() throws Exception;
    public Tipousuario getByIdTipoUsuario(String IdTipoUsuario) throws Exception;
    public boolean delete(Tipousuario tipousuario ) throws Exception;
    public boolean update(Tipousuario tipousuario ) throws Exception;
    public String GetCantidad() throws Exception;    
}
