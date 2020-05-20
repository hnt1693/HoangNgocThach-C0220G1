<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 11/05/2020
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
    #content {
        width: 450px;
        margin: 0 auto;
        padding: 0px 20px 20px;
        background: white;
        border: 2px solid navy;
    }

    h1 {
        color: navy;
    }

    label {
        width: 10em;
        padding-right: 1em;
        float: left;
    }

    #data input {
        float: left;
        width: 15em;
        margin-bottom: .5em;
    }

    #buttons input {
        float: left;
        margin-bottom: .5em;
    }

    br {
        clear: left;
    }
</style>
<body>
<div id="content">
    <h1>Product Discount Calculator</h1>
    <form>
        <div id="data">
            <label>Product Description:</label>
            <% String description = request.getParameter("description");
                float price = Float.parseFloat(request.getParameter("price"));%>
            <label> Description : <%=description %>
            </label><br/>
            <label>List Price:</label>
            <input type="text" name="price"/><br/>
            <label>Discount Percent:</label>
            <input type="text" name="discount_percent"/>(%)<br/>
        </div>
    </form>
</div>
</body>
</html>

