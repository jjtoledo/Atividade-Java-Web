/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.CidadesController;
import br.edu.ufop.web.academico.model.Cidade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author JoseCassimiro
 */
@ManagedBean
@Named(value = "cidadeBean")
@RequestScoped
public class CidadeBean {

    /**
     * Creates a new instance of CidadeBean
     */
    public CidadeBean() {
    }
    
    public List<Cidade> getCidades(){
        CidadesController cidadeController = new CidadesController();
        return cidadeController.getCidades();
    }
}
