/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Encapsulamiento.Usuario;
import java.util.List;

/**
 *
 * @author Montano
 */
public interface InterfaceDatosTUsuario {
    public boolean Registrar(Usuario usuario) throws Exception;
    public List<Usuario> GetAll() throws Exception;
    public Usuario GetById(String id) throws Exception;
    public boolean Modificar(Usuario usuario) throws Exception;
    public boolean Eliminar(Usuario usuario) throws Exception;
    public Usuario Login(String userName, byte[] password) throws Exception;
    public String GetCantidad() throws Exception;
}

