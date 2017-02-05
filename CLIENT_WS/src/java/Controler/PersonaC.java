/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.ConsumeWS;
import java.util.List;

/**
 *
 * @author vimo_
 */
public class PersonaC {
    
    ConsumeWS consWS;
    
    public PersonaC(){
        consWS = new ConsumeWS();
    }
    
    public List<servicio.Persona> listPersons() {        
        return consWS.listPersons();
    }

    public Object readPerson(int id) {
        return consWS.readPerson(id);
    }

    public String insertPerson(int id, String nom, String ape, String iden, String cor, String cel) {
        return consWS.insertPerson(id, nom, ape, iden, cor, cel);
    }

    public String updatePerson(int id, String nom, String ape, String iden, String cor, String cel) {
        return consWS.updatePerson(id, nom, ape, iden, cor, cel);
    }

    public String deletePerson(int id) {
        return consWS.deletePerson(id);
    }
    
}
