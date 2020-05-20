<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 15/05/2020
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<input value="${resuilt}">
<c:forEach items="${resuilt}" var="item" >
    <h1>${item}</h1>
</c:forEach>
</body>
</html>
