<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
<a href="/RedirectWebApp/">Back</a>
<h2 align="center">User Management Application</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h3>List of Users</h3></caption>
        <tr>
            <th>UserName</th>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Age</th>
            <th>Email</th>
            <th>Country</th>
        </tr>
        <c:forEach var="user" items="${userList}">
            <tr>
                <td><c:out value="${user.username}" /></td>
                <td><c:out value="${user.name}" /></td>
                <td><c:out value="${user.prénom}" /></td>
                <td><c:out value="${user.age}" /></td>
                <td><c:out value="${user.email}" /></td>
                <td><c:out value="${user.country}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
