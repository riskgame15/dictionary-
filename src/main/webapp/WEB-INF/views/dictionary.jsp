<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2024
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h2>English - Vietnamese Dictionary</h2>
<form action="dictionary" method="post">
    <table>
        <tr>
            <td>English:</td>
            <td><input type="text" name="eng_word" value="${eng_word}"></td>
        </tr>
        <tr>
            <td>Vietnamese:</td>
            <td>${viet_word}</td>
        </tr>
        <tr>
            <td><button type="submit">Translate</button></td>
            <td></td>
        </tr>
    </table>
</form>
</body>
</html>