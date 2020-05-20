<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 13/05/2020
  Time: 08:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%=request.getParameter("firstOp")%></h1>
<h1><%=request.getParameter("operator")%></h1>
<h1><%=request.getParameter("secondOp")%></h1>
<h1>Caculator : <%=request.getParameter("firstOp")%><%=request.getParameter("operator")%><%=request.getParameter("secondOp")%> =  <c:out value="${requestScope.resuilt}"></c:out></h1>
</body>
</html>
