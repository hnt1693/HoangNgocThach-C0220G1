<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 15/05/2020
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/home">
    <h2>Sandwich Condiment</h2>
    <input type="checkbox" name="checkbox" value="mắm" checked> Mắm<BR>
    <input type="checkbox" name="checkbox" value="muối"> Muối<BR>
    <input type="checkbox" name="checkbox" value="nước mắm"> Nước mắm<BR>
    <input type="checkbox" name="checkbox" value="bột ngọt"> Bột ngọt++<BR>
    <input type="checkbox" name="checkbox" value="tiêu"> Tiêu <BR>
    <input type="submit" value="Submit">
</form>
</body>
</html>
