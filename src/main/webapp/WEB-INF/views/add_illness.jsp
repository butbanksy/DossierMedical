<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: banksy
  Date: 1/1/2020
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Ajouter une maladie/allergie</title>
</head>
<body>
<c:choose>
    <c:when test="${empty myPatient}">
        <h3>You are not signed in!</h3>
    </c:when>
    <c:when test="${!myPatient.admin}">
        <h3>You are not allowed to access this page!</h3>
    </c:when>
    <c:otherwise>
        <h3>Ajouter une maladie/allergie</h3>
        <p>
        <form action="illness" method="post">
            <label>Nom maladie : </label>
            <input type="text" name="illnessName"> <br><br>
            <button>Ajouter</button>

        </form>
        </p>
        <p>
        <table>
            <tr>
                <th>ID</th>
                <th>Maladie/Allergie</th>
            </tr>
            <c:forEach items="${list}" var="element">
                <tr>
                    <td>${element.illnessID}</td>
                    <td>${element.illnessName}</td>
                </tr>
            </c:forEach>
        </table>
        </p>
    </c:otherwise>
</c:choose>

</body>
</html>
