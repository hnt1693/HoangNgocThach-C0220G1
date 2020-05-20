<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 12/05/2020
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CustomerList</title>
</head>
<body>
<h1>Customer List</h1>
<p1>
    <a href ="/customers?action =create"></a>
</p1>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Birthday</td>
            <td>Address</td>
            <td>Image</td>
        </tr>
        <c:forEach items="${requestScope.customers}" var="customer">
            <td> ${customer.name} </td>
            <td> ${customer.bod} </td>
            <td> ${customer.address} </td>
            <td> ${customer.urlImg} </td>
        </c:forEach>
    </table>

</body>
</html>
