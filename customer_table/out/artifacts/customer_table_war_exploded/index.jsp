<%@ page import="java.util.ArrayList" %>
<%@ page import="com.fil.model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 12/05/2020
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<c:forEach var="i" begin="1" end="5">
Item <c:out value="${i}"/><p>
    </c:forEach>
<c:redirect url="/list.jsp"></c:redirect>
</body>
</html>
