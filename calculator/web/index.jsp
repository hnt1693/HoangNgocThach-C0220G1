<%--
  Created by IntelliJ IDEA.
  User: fil
  Date: 13/05/2020
  Time: 08:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>

        label {
            width: 500px;
            color: blue;
            padding-bottom: 50px;
        }
        input{
           width: 200px;
            margin-right: 5px;
        }

        div {
            margin-bottom: 20px;
        }
        .content{
            width: 600px;
        }
    </style>
</head>
<body>
<div class="content">
    <form method="post" action="/calculator">
        <h1>SIMPLE CALCULATOR</h1>
        <div>
            <label style="width: 250px" for="firstOperand">First Operand</label>
            <input type="number" id="firstOperand" name="firstOp"></br>
        </div>
        <div>
            <label for="operator">Operator</label>
            <select id="operator" name="operator">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select> </br>
        </div>
        <div>
            <label for="secondOperand">Second Operand</label>
            <input type="number" id="secondOperand" name="secondOp"></br>
        </div>
        <div>
            <button type="submit"> Calculator</button>
        </div>


    </form>
</div>

</body>
</html>
