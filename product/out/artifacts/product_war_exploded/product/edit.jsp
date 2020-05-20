<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 13/05/2020
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form method="post" accept-charset="UTF-8">
    <input type="text" placeholder="Name" name="name" value="${requestScope.productById.name}"></br>
    <input type="text" placeholder="price" name="price" value="${requestScope.productById.price}"></br>
    <input type="text" placeholder="Description" name="description" value="${requestScope.productById.decription}"></br>
    <input type="text" placeholder="production" name="production" value="${requestScope.productById.production}" ></br>
    <button type="submit"> Update</button>
</form>
</body>
</html>