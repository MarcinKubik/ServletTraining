<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 09.02.2021
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowCars</title>
</head>
<body>
<table>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td>${car.brand}</td>
            <td>${car.model}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
