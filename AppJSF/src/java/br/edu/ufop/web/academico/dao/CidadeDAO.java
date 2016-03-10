/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.dao;

import br.edu.ufop.web.academico.model.Cidade;
import br.edu.ufop.web.persistence.MySQLConnectionProcess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseCassimiro
 */
public class CidadeDAO {
    public CidadeDAO() {
        
        MySQLConnectionProcess.getInstance().setHost("localhost");
        MySQLConnectionProcess.getInstance().setDatabase("academico");
        MySQLConnectionProcess.getInstance().setDbUsername("sistemaweb");
        MySQLConnectionProcess.getInstance().setDbPassword("");    
        
    }
    
    public List<Cidade> getCidades() throws SQLException{
        
        List<Cidade> cidades = new ArrayList<Cidade>();
        
        String sql = "SELECT id, nome FROM cidades"; //buscar os dados
        
        ResultSet rs = MySQLConnectionProcess.getInstance().getStatement().executeQuery(sql);
        
        while(rs.next()){
            Cidade cidade = new Cidade();
            cidade.setId(rs.getInt("id"));
            cidade.setNome(rs.getString("nome"));
            
            cidades.add(cidade);
            
        }
        
        return cidades;
    }

}
