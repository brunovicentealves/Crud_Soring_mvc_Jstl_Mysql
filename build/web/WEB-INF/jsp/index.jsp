<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Crud Spring MVC</title>
    </head>

    <body>
        <div class="Container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregar.htm"><button type="button" class="btn btn-dark">Cadastrar Pessoa</button></a>
                </div>
                <div class="card-body">
                    <table  class="table">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nome</th>
                                <th>Nacionalidade</th>
                                <th>Açôes</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dados" items="${lista}">
                            <tr>
                                <td><c:out value="${dados.id}"/></td>
                                <td><c:out value="${dados.nome}"/></td>
                                <td><c:out value="${dados.nacionalidade}"/></td>
                                <td>
                                    <a>Editar</a>
                                    <a>Excluir</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </body>
</html>
