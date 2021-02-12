
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj samochód</title>
</head>
<body>
<form action="/addCar" method="post">
    <label>
        Marka
        <input type="text" name="brand">
    </label>
    <label>
        Model
        <input type="text" name="model">
    </label>
    <button type="submit">Wyślij</button>
</form>
</body>
</html>
