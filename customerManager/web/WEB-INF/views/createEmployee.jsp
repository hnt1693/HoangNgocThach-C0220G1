<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 18/05/2020
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ADD NEW CUSTOMER</h1>
<form:form action="create" modelAttribute="customer" method="post">
    <form:input path="name"></form:input>
    <form:input path="dob"></form:input>
    <form:input path="address"></form:input>
    <form:input path="email"></form:input>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
