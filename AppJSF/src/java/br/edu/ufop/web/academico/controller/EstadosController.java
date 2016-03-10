/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufop.web.academico.controller;

import br.edu.ufop.web.academico.dao.EstadoDAO;
import br.edu.ufop.web.academico.model.Estado;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author JoseCassimiro
 */
public class EstadosController {
    public List<Estado> getEstados(){
        
        EstadoDAO estadoDAO = new EstadoDAO();
        
        try{
            return estadoDAO.getEstados();
        }
        catch (SQLException ex){
            Logger.getLogger(EstadosController.class.getName());
        }
   
        return null;
    } 
}
