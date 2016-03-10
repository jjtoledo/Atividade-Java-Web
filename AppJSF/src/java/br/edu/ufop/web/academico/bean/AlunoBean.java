/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.AlunosController;
import br.edu.ufop.web.academico.model.Aluno;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author JoseCassimiro
 */
@ManagedBean
@Named(value = "alunoBean")
@RequestScoped
public class AlunoBean {

    /**
     * Creates a new instance of AlunoBean
     */
    public AlunoBean() {
    }
    
    public List<Aluno> getAlunos(){
        AlunosController alunoController = new AlunosController();
        return alunoController.getAlunos();
    }
    
}
