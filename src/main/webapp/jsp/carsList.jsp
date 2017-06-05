<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Title2</title>
    </head>
<body>
    <h2>Car List</h2><br><br>
    <c:forEach items="${carlist}" var="element">
        <c:out value="${element.marc}"></c:out>
        <c:out value="${element.collor}"></c:out>
        <c:out value="${element.cost}"></c:out>
        <br>
    </c:forEach>
</body>
</html>