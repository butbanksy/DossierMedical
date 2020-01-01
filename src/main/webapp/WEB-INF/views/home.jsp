<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: banksy
  Date: 1/1/2020
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Patient's page</title>
</head>
<body>
    <c:choose>
        <c:when test="${empty myPatient}">
            NOT signed in
        </c:when>
        <c:otherwise>
            <h3>Welcome to your your personal info</h3>
            <p>Nom: <c:out value="${myPatient.lastName}"/></p>
            <p>Prenom: <c:out value="${myPatient.firstName}"/></p>
            <p>Age: <c:out value="${myPatient.age}"/></p>
            <h2>Maladie/Allergie</h2>
            <table>
                <tr>
                    <td>ID</td>
                    <td>Maladie</td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>

</body>
</html>
