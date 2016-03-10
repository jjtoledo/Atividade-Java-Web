
package br.edu.ufop.web.academico.dao;

import br.edu.ufop.web.academico.model.Aluno;
import br.edu.ufop.web.persistence.MySQLConnectionProcess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {

    public AlunoDAO() {
        
        MySQLConnectionProcess.getInstance().setHost("localhost");
        MySQLConnectionProcess.getInstance().setDatabase("academico");
        MySQLConnectionProcess.getInstance().setDbUsername("sistemaweb");
        MySQLConnectionProcess.getInstance().setDbPassword("");    
        
    }
    
    public List<Aluno> getAlunos() throws SQLException{
        
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        String sql = "SELECT id, nome FROM alunos"; //buscar os dados
        
        ResultSet rs = MySQLConnectionProcess.getInstance().getStatement().executeQuery(sql);
        
        while(rs.next()){
            Aluno aluno = new Aluno();
            aluno.setId(rs.getInt("id"));
            aluno.setNome(rs.getString("nome"));
            
            alunos.add(aluno);
            
        }
        
        return alunos;
    }
    
}
