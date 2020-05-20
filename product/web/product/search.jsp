<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 13/05/2020
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><a href="/product">BackToList</a></h1>

<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Description</td>
        <td>Production</td>
    </tr>
    <c:forEach items='${requestScope.listProduct1}' var="product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDecription()}</td>
            <td>${product.getProduction()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>