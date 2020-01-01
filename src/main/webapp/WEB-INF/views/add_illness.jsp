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
</body>
</html>
