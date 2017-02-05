 
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author viviana
 */
public class Conexion {
    
    static String user= "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/BDPersona";
    
    Connection conexion = null;
    
    private static Conexion dbConexion = null;
    
    private static Statement st_conexion= null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        /*Create statement*/
        try {
            st_conexion = conexion.createStatement();
        } catch (SQLException ex) {
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public static Conexion getDBConexion() {
        if (dbConexion == null) {
            dbConexion = new Conexion();
        }
        return dbConexion;
    }

    public ResultSet SQLSelect(String sql) throws SQLException{
        ResultSet resultado;
        resultado = st_conexion.executeQuery(sql);
        return resultado;
    }

    public void SQLUpdate(String sql) throws SQLException{
        st_conexion.executeUpdate(sql);
    }
    
    public int generateID(String tabla)throws SQLException{
        int resultado;
        ResultSet res = st_conexion.executeQuery("SELECT * FROM " + tabla
            + " ORDER BY id DESC LIMIT 1");
        resultado = res.getInt("id");
        return resultado + 1;
    }
    
}

