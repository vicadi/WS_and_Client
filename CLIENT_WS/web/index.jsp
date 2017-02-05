<%-- 
    Document   : index
    Created on : 4/02/2017, 03:04:13 PM
    Author     : vimo_
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%List<servicio.Persona> listPersona = (List<servicio.Persona>)session.getAttribute("listPerson");%>
<%servicio.Persona persona = (servicio.Persona)session.getAttribute("persona");%>
<%String mensaje = (String)session.getAttribute("mensaje");%>
<html>
    <head>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PERSONAS</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" /> 
        <script src="js/jquery-1.12.4.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootbox.min.js"></script>
        <script src="js/script.js"></script>
    </head>
    </head>
    <body>
        <h1>PERSONAS</h1>        
        
        <div class="divContenido">
            <div class="divInterno" id="divListado">
                <h2>LISTADO</h2>
                <table id="tableListPerson" class="table table-bordered table-condensed table-striped">   
                    <thead>
                        <tr>
                            <th>ID</hd>
                            <th>NOMBRE</th>
                            <th>APELLIDO</th>
                            <th>IDENTIFICACIÓN</th>
                            <th>CORREO</th>
                            <th>CELULAR</th>
                            <th>ACCIÓN</th>
                        </tr>  
                    </thead>
                    <tbody>
                        <% for (int i = 0; i < listPersona.size(); i++) {%>
                        <tr>
                            <td><%=listPersona.get(i).getId()%></td>
                            <td><%=listPersona.get(i).getNombre()%></td>
                            <td><%=listPersona.get(i).getApellido()%></td>
                            <td><%=listPersona.get(i).getIdentificacion()%></td>
                            <td><%=listPersona.get(i).getCorreo()%></td>
                            <td><%=listPersona.get(i).getCelular()%></td>
                            <td>
                                <a href="./?accion=editar&id=<%=listPersona.get(i).getId()%>">
                                    Editar</a>
                                <span> ---- </span>
                                <a href="javascript:void(0);" enlace="./?accion=eliminar&id=<%=listPersona.get(i).getId()%>" 
                                   class="aEliminar" nombre="<%=listPersona.get(i).getNombre()%> <%=listPersona.get(i).getApellido()%>">
                                    Eliminar</a></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
            <div class="divInterno" id="divEdicion">
                <h2>AGREGAR/EDITAR</h2>
                <form action="./" method="POST">
                    <%if (persona != null) {%>
                        <input type="hidden" name="accion" value="update"/>
                    <%} else {%>
                        <input type="hidden" name="accion" value="insert"/>
                    <%}%>
                    <table id="tableEdicion" class="table-condensed">
                        <tr>
                            <td colspan="2"><div class="form-group">
                                <label for="ipId">ID</label> 
                                <%if (persona != null) {%>
                                <input type="text" readonly="true" class="form-control" id="ipId" name="id" value="<%=persona.getId()%>"/>
                                <%} else {%>
                                    <input type="text" class="form-control ipEdicion" id="ipId" name="id" value=""/>                        
                                <%}%>
                            </div>
                            <div class="form-group">
                                <label for="ipNombre">NOMBRE</label> 
                                <%if (persona != null) {%>
                                    <input type="text" class="form-control ipEdicion" id="ipNombre" name="nombre" value="<%=persona.getNombre()%>"/>
                                <%} else {%>
                                    <input type="text" class="form-control ipEdicion" id="ipNombre" name="nombre" value=""/>                        
                                <%}%>
                            </div></td>
                        </tr>
                        <tr>
                            <td colspan="2"><div class="form-group">
                                <label for="ipApellido">APELLIDO</label> 
                                <%if (persona != null) {%>
                                    <input type="text" class="form-control ipEdicion" id="ipApellido" name="apellido" value="<%=persona.getApellido()%>"/>
                                <%} else {%>
                                    <input type="text" class="form-control ipEdicion" id="ipApellido" name="apellido" value=""/>                        
                                <%}%>
                            </div>
                            <div class="form-group">
                                <label for="ipIdentificacion">IDENTIFICACIÓN</label> 
                                <%if (persona != null) {%>
                                    <input type="text" class="form-control ipEdicion" id="ipIdentificacion" name="identificacion" value="<%=persona.getIdentificacion()%>"/>
                                <%} else {%>
                                    <input type="text" class="form-control ipEdicion" id="ipIdentificacion" name="identificacion" value=""/>                        
                                <%}%>
                            </div></td>
                        </tr>
                        <tr>
                            <td colspan="2"><div class="form-group">
                                <label for="ipCorreo">CORREO</label> 
                                <%if (persona != null) {%>
                                    <input type="text" class="form-control ipEdicion" id="ipCorreo" name="correo" value="<%=persona.getCorreo()%>"/>
                                <%} else {%>
                                    <input type="text" class="form-control ipEdicion" id="ipCorreo" name="correo" value=""/>                        
                                <%}%>
                            </div>
                            <div class="form-group">
                                <label for="ipCelular">CELULAR</label> 
                                <%if (persona != null) {%>
                                    <input type="text" class="form-control ipEdicion" id="ipCelular" name="celular" value="<%=persona.getCelular()%>"/>
                                <%} else {%>
                                    <input type="text" class="form-control ipEdicion" id="ipCelular" name="celular" value=""/>                        
                                <%}%>
                            </div></td>
                        </tr>
                        <tr>
                            <td class="tdButton">
                                <button type="submit" class="btn-success">GUARDAR</button>
                            </td><td class="tdButton">
                                <button type="button" class="btn-danger" onclick="window.location.href='./index'">LIMPIAR</button>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <% if(mensaje!=null){%>
                                    <h3 id="mensaje"><%=mensaje%></h3>
                                <%}%>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>            
        </div>
            <footer>
                <p>Hecho por: Xenia Viviana Cadena Díaz</p>
                <p>Contacto: vicadi7@gmail.com</p>
                <p>Bogotá D.C. Febrero 2017</p>
            </footer>
    </body>
</html>
