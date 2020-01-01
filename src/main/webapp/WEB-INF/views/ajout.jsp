<%--
  Created by IntelliJ IDEA.
  User: banksy
  Date: 12/31/2019
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un nouveau patient</title>
</head>
<body>
<p>
<form method="post" action="signup">
    <label>Prénom : </label>
    <input type="text" name="firstName"><br><br>
    <label>Nom : </label>
    <input type="text" name="lastName"><br><br>
    <label>Age : </label>
    <input type="number" name="age"><br><br>
    <label>Login : </label>
    <input type="text" name="login"><br><br>
    <label>Password : </label>
    <input type="text" name="password"><br><br>
    <button>S'inscrire</button>
</form>
</p>
</body>
</html>
