/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vimo_
 */
public class PersonaDAO {
    
    Conexion dbConexion;
    
    public PersonaDAO(){
        dbConexion = Conexion.getDBConexion();
    }
    
    public ArrayList<Persona> listPersons() throws SQLException{
        ArrayList<Persona> listaPersonas = new ArrayList();
        String consulta;
        consulta = "SELECT * FROM bdpersona.persona ORDER BY Id";        
        ResultSet res= dbConexion.SQLSelect(consulta);
        while(res.next()){
            int id= res.getInt("Id");
            String nombre = res.getString("Nombre");
            String apellido = res.getString("Apellido");
            String identif = res.getString("Identificacion");
            String correo = res.getString("Correo");
            String celular = res.getString("Celular");
            listaPersonas.add(new Persona(id,nombre,apellido,identif,correo,celular));
        }
        return listaPersonas;
    }
    
    public Persona readPerson(int id) throws SQLException{
        Persona persona=null;
        String consulta="SELECT * FROM bdpersona.persona WHERE id=:id";
        consulta = consulta.replaceFirst(":id", id+"");
        ResultSet res= dbConexion.SQLSelect(consulta);   
        if(res.next()){
            persona=new Persona(res.getInt("id"),res.getString("Nombre"),
                        res.getString("Apellido"),res.getString("Identificacion"),
                        res.getString("Correo"), res.getString("Celular"));
        }
        return persona;
    }
    
    public void insertPerson(Persona persona) throws SQLException{        
        int id = persona.getId(); 
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        String identif = persona.getIdentificacion();
        String correo = persona.getCorreo();
        String celular = persona.getCelular();
        String consulta = "INSERT INTO persona VALUES (:id,:nom,:ape,:iden,:corr,:cel)";   
        consulta = consulta.replaceFirst(":id", id+"").replaceFirst(":nom", "'"+nombre+"'").
                   replaceFirst(":ape", "'"+apellido+"'").replaceFirst(":iden", "'"+identif+"'").
                   replaceFirst(":corr", "'"+correo+"'").replaceFirst(":cel", "'"+celular+"'");
        dbConexion.SQLUpdate(consulta);
    }
    //('id','nombre','apellido','identificacion',"+"'correo','celular') 
    public boolean updatePerson(Persona persona) throws SQLException{
        int id = persona.getId();
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        String identif = persona.getIdentificacion();
        String correo = persona.getCorreo();
        String celular = persona.getCelular();
        String consulta = "UPDATE persona SET nombre=:nom, apellido=:ape," +
                "identificacion=:iden, correo=:corr,celular=:cel WHERE id=:id";
        consulta = consulta.replaceFirst(":nom", "'"+nombre+"'").
                   replaceFirst(":ape", "'"+apellido+"'").replaceFirst(":iden", "'"+identif+"'").
                   replaceFirst(":corr", "'"+correo+"'").replaceFirst(":cel", "'"+celular+"'")
                   .replaceFirst(":id", id+"");
        dbConexion.SQLUpdate(consulta); 
        return true;
    }

    public boolean deletePerson(int id) throws SQLException{
        String consulta = "DELETE FROM bdpersona.persona WHERE id=:id";
        consulta = consulta.replaceFirst(":id",id+"");
        dbConexion.SQLUpdate(consulta);
        return true;
    }
}
