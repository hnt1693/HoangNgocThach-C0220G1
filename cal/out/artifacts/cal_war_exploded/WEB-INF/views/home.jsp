<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 15/05/2020
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/home" >
    <h2>Calculator</h2>
    <input type="number" name="firstNum" placeholder="Fisrt Num" value="${fN}">
    <input type="number" name="secondNum" placeholder="Second Num" value="${sN}"></br>
    <input type="submit" value="+" name="oper">
    <input type="submit" value="-" name="oper">
    <input type="submit" value="*" name="oper">
    <input type="submit" value="/" name="oper">
    <input type="submit">
    <h1>${resuilt}</h1>
</form>
<form:form modelAttribute="resuilt">
    <h1>${resuilt}</h1>
</form:form>
</body>
</html>
