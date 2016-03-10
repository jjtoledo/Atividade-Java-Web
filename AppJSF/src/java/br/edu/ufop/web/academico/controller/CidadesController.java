/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.controller;

import br.edu.ufop.web.academico.dao.CidadeDAO;
import br.edu.ufop.web.academico.model.Cidade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author JoseCassimiro
 */
public class CidadesController {
    public List<Cidade> getCidades(){
        
        CidadeDAO cidadeDAO = new CidadeDAO();
        
        try{
            return cidadeDAO.getCidades();
        }
        catch (SQLException ex){
            Logger.getLogger(CidadesController.class.getName());
        }
   
        return null;
    } 
}
