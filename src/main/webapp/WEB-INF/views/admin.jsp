<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: banksy
  Date: 1/1/2020
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Admin page</title>
</head>
<body>
<p>
<h3>Bonjour <c:out value="${myPatient.firstName} ${myPatient.lastName}"/></h3>
</p>
<p>
    <form method="post" action="search">
    <label>ID du client : </label>
    <input type="number" name="patientID"><br><br>
    <button>Rechercher</button>
    </form>
</p>
<p>
<a href="signup" >Ajouter client</a>
<a href="illness">Ajouter maladie/allergie</a>
</p>
</body>
</html>
