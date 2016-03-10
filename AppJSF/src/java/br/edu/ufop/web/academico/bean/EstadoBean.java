/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.EstadosController;
import br.edu.ufop.web.academico.model.Estado;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author JoseCassimiro
 */
@ManagedBean
@RequestScoped
public class EstadoBean {

    /**
     * Creates a new instance of EstadoBean
     */
    public EstadoBean() {
    }
    
    public List<Estado> getEstados(){
        EstadosController estadoController = new EstadosController();
        return estadoController.getEstados();
    }
}
