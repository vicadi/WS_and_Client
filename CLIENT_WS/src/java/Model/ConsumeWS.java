/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import servicio.Persona;

/**
 *
 * @author vimo_
 */
public class ConsumeWS {
    
    servicio.Servicio_Service service;
    servicio.Servicio port;
    
    public ConsumeWS(){
        service = new servicio.Servicio_Service();
        port = service.getServicioPort();
    }

    public List<servicio.Persona> listPersons() {        
        return port.listPersons();
    }

    public Object readPerson(int id) {
        return port.readPerson(id);
    }

    public String insertPerson(int id, String nom, String ape, String iden, String cor, String cel) {
        return port.insertPerson(id, nom, ape, iden, cor, cel);
    }

    public String updatePerson(int id, String nom, String ape, String iden, String cor, String cel) {
        return port.updatePerson(id, nom, ape, iden, cor, cel);
    }

    public String deletePerson(int id) {
        return port.deletePerson(id);
    }
    
}
