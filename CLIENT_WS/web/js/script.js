/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
    $(".ipEdicion").on("keyup",function(){
        $("#mensaje").text("");
    });
    
    $(".aEliminar").on("click",function(){
        $("#mensaje").text("");
    });
    
    $(".aEliminar").on('click',function(){
        var nombre=$(this).attr('nombre');
        var enlace=$(this).attr('enlace');
        bootbox.confirm("¿Eliminar persona "+nombre+"?", function(result) {    
          if(result){
            document.location.href=enlace;
          }      
        }); 
      });  
});

