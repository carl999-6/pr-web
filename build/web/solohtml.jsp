<%-- 
    Document   : solohtml
    Created on : 7/09/2024, 9:24:46 a. m.
    Author     : Carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    </head>
    <body>
        <h1>Formulario empleados</h1>
        <<a href="index.jsp">Menú</a>
        <div class="container">
  <!-- Content here -->

        <form action="#" method="post" class="form-gruop needs-validation" novalidate> <!-- get = url, post = oculto -->
            <label for="lbl_id" class="form-label"><b>ID:</b></label>
            <input type="text" name ="txt_id" id="txt_id" class="form-control" value="0" readonly>
            <label for="lbl_codigo" class="form-label"><b>Codigo:</b></label>
            <input type="text" name ="txt_codigo" id="txt_codigo" class="form-control" placeholder="Ejemplo: E001" pattern="[E]{1}[0-9]{3}" required>
             <label for="lbl_nombre" class="form-label"><b>Nombres:</b></label>
            <input type="text" name ="txt_nombres" id="txt_nombres" class="form-control" placeholder="Ejemplo: Nombre1 Nombre2" required>
            <label for="lbl_apellidos" class="form-label"><b>Apellidos:</b></label>
            <input type="text" name ="txt_apellidos" id="txt_apellidos" class="form-control" placeholder="Ejemplo: Apellido1 Apellido2" required>
            <label for="lbl_direccion" class="form-label"><b>Dirección:</b></label>
            <input type="text" name ="txt_dirección" id="txt_dirección" class="form-control" placeholder="Ejemplo: Calle-Avenida-Zona" required>
            <label for="lbl_numero" class="form-label"><b>Telefono:</b></label>
            <input type="number" name ="txt_numero" id="txt_numero" class="form-control" placeholder="Ejemplo: 55-55-55-55" required>
            <label for="lbl_fecha" class="form-label"><b>Fecha:</b></label>
            <input type="date" name ="txt_fecha" id="txt_fecha" class="form-control" placeholder="Ejemplo: 1999-01-01" required>
            
         
            <label for="lbl_puestos" class="form-label" ><b>Puestos:</b></label>
            <select name ="drop_puesto" id="drop_puesto" class="form-select" required>
            <option selected  disabled value="">Seleccione</option>
            <option value="1">Programador</option>
            <option value="2">Analista</option>
            </select>
            </br>
            <button name="btn_crear" id="btn_crear" class="btn btn-primary" value="crear"><i class="bi bi-download"></i> Crear</button>
            <button name="btn_actualizar" id="btn_actualizar" class="btn btn-warning" value="actualizar"><i class="bi bi-pencil-square"></i> Actualizar</button>
            <button name="btn_borrar" id="btn_borrar" class="btn btn-danger" value="borrar"><i class="bi bi-folder-x"></i> Borrar</button>


            
        </form>
  </div>
        <script>
            // Example starter JavaScript for disabling form submissions if there are invalid fields
(function () {
  'use strict'

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  var forms = document.querySelectorAll('.needs-validation')

  // Loop over them and prevent submission
  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }

        form.classList.add('was-validated')
      }, false)
    })
})()
        </script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </body>
</html>
