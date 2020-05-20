<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 13/05/2020
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><a href="/product?action=create">Create new Product</a></h1>
<h2>Search product by name : </h2>

<input type="text" name="findName" id="name">
<h2><a href='' onclick="this.href='/product?action=search&name='+document.getElementById('name').value">Search</a> </h2>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope.listProduct.values()}' var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/product?action=view&id=${product.id}">${product.name}</a></td>
            <td>${product.price}</td>
            <td><a href="/product?action=edit&id=${product.id}">edit</a></td>
            <td><a href="/product?action=delete&id=${product.id}"> delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
