<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Авторы</title>
</head>
<body>
<h1>Авторы</h1>
<br>

<table>
    <c:forEach var="author" items="${authorsList}">
        <tr>
            <td><a href="index.jsp">
                    ${author.name}
            </a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
