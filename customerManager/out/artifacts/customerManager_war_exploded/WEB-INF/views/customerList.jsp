<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 18/05/2020
  Time: 11:30
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
<table border="1px" class="table" style="padding-left: 10px;border: blue; border-width: 2px">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>DOB</th>
        <th>Address</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.dob}</td>
            <td>${customer.address}</td>
            <td>${customer.email}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
