/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.UsuariosController;
import br.edu.ufop.web.academico.model.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author JoseCassimiro
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    }
    
    public List<Usuario> getUsuarios(){
        UsuariosController usuarioController = new UsuariosController();
        return usuarioController.getUsuarios();
    }
}
