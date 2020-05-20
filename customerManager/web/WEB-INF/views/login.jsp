<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 16/05/2020
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <style>
        div{
            padding: 10px;
        }

    </style>
</head>
<body>
<h1>Login</h1>
<form:form method="post" action="login">
        <div >
        <label class="col-form-label" for="id">ID :</label>
        <input type="text" name="id" id="id" placeholder="ID"></br>
    </div>
    <div>
        <label for="pass" class="col-form-label">Password :</label>
        <input type="text" name="password" id="pass" placeholder="YourPassword"></br>
    </div>
    <div>
        <input type="submit" value="Login with this infor">
    </div>

</form:form>
</body>
</html>
