<%-- 
    Document   : editar
    Created on : 26/08/2019, 16:01:25
    Author     : bruno.alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Editar</title>
    </head>
    <body>
        <div class="container mt-6 col-lg-4 text-center">

            <div class="card border-info">
                <div class="card-header">Editar Dados Pessoais</div>
                <form method="POST">
                    <div class="form-group col-md-12 align-middle text-center">
                        <label >Nome</label>
                        <input  type="text" name="nome"   class="form-control" value="${lista[0].nome}">
                    </div>
                    <div class="form-group col-md-12 align-middle text-center">
                        <label >E-mail</label>
                       <input  type="text" name="nacionalidade"  class="form-control" value="${lista[0].nacionalidade}">
                    </div>
                    <div class="form-group col-md-12 align-middle text-left">
                        <input  type="submit"  value="editar" class="btn btn-success" >
                    <a htef="index.htm" class="btn btn-danger">Regressar</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
