<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>INCS</title>
</head>
<body>
<form action="/RedirectWebApp/registerSuccess" method="post">
    <table>

        <tr>
            <td>User Name</td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <td>Email</td>
            <td><input type="text" name="email"></td>
        </tr>


        <tr>
            <td>Age</td>
            <td><input type="text" name="age"></td>
        </tr>

        <tr>
            <td>Country</td>
            <td><select name="country">
                <option value="India">India</option>
                <option value="US">US</option>
                <option value="Other">Other</option>
            </select></td>
        </tr>

        <tr>
            <td><input type="submit" value="Register"></td>
        </tr>


    </table>
</form>
</body>
</html>