
package br.edu.ufop.web.academico.controller;

import br.edu.ufop.web.academico.dao.AlunoDAO;
import br.edu.ufop.web.academico.model.Aluno;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class AlunosController { //acessar DAO e retorna informações

    public List<Aluno> getAlunos(){
        
        AlunoDAO alunoDAO = new AlunoDAO();
        
        try{
            return alunoDAO.getAlunos();
        }
        catch (SQLException ex){
            Logger.getLogger(AlunosController.class.getName());
        }
   
        return null;
    } 
}
