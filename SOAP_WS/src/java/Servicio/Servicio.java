/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Model.Persona;
import Model.PersonaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author vimo_
 */
@WebService(serviceName = "Servicio")
public class Servicio {
    
    PersonaDAO perDAO;
    Persona persona;
    
    @WebMethod(operationName = "ListPersons")
    public ArrayList<Persona> ListPersons(){
        perDAO = new PersonaDAO();        
        try {
            return perDAO.listPersons();
        } catch (SQLException ex) {
            return null;
        }
    }
    
    @WebMethod(operationName = "insertPerson")
    public String insertPerson(int id,String nom,String ape,String iden,String corr,String cel){
        perDAO = new PersonaDAO();
        persona = new Persona(id,nom,ape,iden,corr,cel);
        try {
            perDAO.insertPerson(persona);
            return "Inserción exitosa";
        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }
    
    @WebMethod(operationName = "updatePerson")
    public String updatePerson(int id,String nom,String ape,String iden,String corr,String cel){
        perDAO = new PersonaDAO();
        persona = new Persona(id,nom,ape,iden,corr,cel);
        try {
            perDAO.updatePerson(persona);
            return "Actualización exitosa";
        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }
    
    @WebMethod(operationName = "deletePerson")
    public String deletePerson(int id){
        perDAO = new PersonaDAO();
        try {
            perDAO.deletePerson(id);
            return "Eliminación exitosa";
        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }
    
    @WebMethod(operationName = "readPerson")
    public Object readPerson(int id){
        perDAO = new PersonaDAO();
        try {            
            return perDAO.readPerson(id);
        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }
    
}
