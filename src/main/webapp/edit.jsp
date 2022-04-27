<%--
  Created by IntelliJ IDEA.
  User: vikaz
  Date: 27.04.2022
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit product</title>
</head>
<body>
<h3>Edit product</h3>
<form method="post">
    <input type="hidden" value="${product.id}" name="id" />
    <label>Name</label><br>
    <input name="name" value="${product.name}" /><br><br>
    <label>Price</label><br>
    <input name="price" value="${product.price}" type="number" min="100" /><br><br>
    <input type="submit" value="Send" />
</form>
</body>
</html>
