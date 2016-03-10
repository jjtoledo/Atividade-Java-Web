/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.controller;

import br.edu.ufop.web.academico.dao.UsuarioDAO;
import br.edu.ufop.web.academico.model.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author JoseCassimiro
 */
public class UsuariosController {
    public List<Usuario> getUsuarios(){
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        try{
            return usuarioDAO.getUsuarios();
        }
        catch (SQLException ex){
            Logger.getLogger(UsuariosController.class.getName());
        }
   
        return null;
    } 
}
