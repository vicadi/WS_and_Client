/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Servlets;

import Controler.PersonaC;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viviana
 */
@WebServlet(name = "PersonaServlet", urlPatterns = {"","/index"})
public class PersonaServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
        PersonaC persCont = new PersonaC();     
        Object persona = null;   
        String accion;
        String id;
        int idPer;    
        String mensaje=null; 
        
        try{ 
            if (request.getParameter("id") != null) {
                id=request.getParameter("id");
                idPer = Integer.parseInt(id);
                accion = request.getParameter("accion");
                if (accion.equals("eliminar")) {
                    mensaje = persCont.deletePerson(idPer);
                }
                if (accion.equals("editar")) {
                    persona = persCont.readPerson(idPer);
                    mensaje = "";
                }
            }
            
            List<servicio.Persona> listPerson = persCont.listPersons();
            request.getSession().setAttribute("persona", persona);
            request.getSession().setAttribute("listPerson", listPerson);
            request.getSession().setAttribute("mensaje", mensaje);
            response.sendRedirect("index.jsp");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{          
        PersonaC persCont = new PersonaC();
        servicio.Persona persona = null;
        int id = Integer.parseInt(request.getParameter("id"));
        String nom = request.getParameter("nombre");
        String ape = request.getParameter("apellido");
        String iden = request.getParameter("identificacion");
        String cor = request.getParameter("correo");
        String cel = request.getParameter("celular");
        String accion = request.getParameter("accion");
        String mensaje=null;
        if(accion.equals("update")){
            mensaje = persCont.updatePerson(id, nom, ape, iden, cor, cel);
        }else{
            mensaje=persCont.insertPerson(id, nom, ape, iden, cor, cel);
        }
        List<servicio.Persona> listPerson = persCont.listPersons();
        request.getSession().setAttribute("persona", persona);
        request.getSession().setAttribute("listPerson", listPerson);
        request.getSession().setAttribute("mensaje", mensaje);
        response.sendRedirect("index.jsp");
    }
    
}
