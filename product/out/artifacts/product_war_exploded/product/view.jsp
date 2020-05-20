<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 13/05/2020
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<form method="post" accept-charset="UTF-8">
    <input type="text" placeholder="Name" name="name" disabled value="${requestScope.productById.name}"></br>
    <input type="text" placeholder="price" name="price" disabled value="${requestScope.productById.price}"></br>
    <input type="text" placeholder="Description" disabled name="description" value="${requestScope.productById.decription}"></br>
    <input type="text" placeholder="production" disabled name="production" value="${requestScope.productById.production}" ></br>
    <h2> <a href="/product"> back to list</a></h2>
</form>
</body>
</html>
