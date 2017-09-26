<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Добавление автора</title>
    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            background: #edebd5;
            font-family: Verdana, Geneva, Arial, Helvetica, sans-serif;
            font-size: 11px;
            color: #000;
        }

        #container {
            width: 400px;
            height: 200px;
            margin: 0 auto;
            overflow: visible;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -200px;
            margin-top: -100px;
            background: #ffffff;
        }

    </style>
</head>
<body>
<div id="container" align="center">
    <h1>Добавление автора</h1>
    <form action="create-author">
        <table>
            <tr>
                <td>Имя</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Дата рождения</td>
                <td><input type="text" name="date_of_birth">
            </tr>
            <tr>
                <td>Биография</td>
                <td><input type="text" name="biography">
            </tr>
            <td><input type="submit" name="Добавить"></td>
        </table>
    </form>
</div>
</body>
</html>