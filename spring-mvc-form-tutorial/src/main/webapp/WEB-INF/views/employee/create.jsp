<%--
  Created by IntelliJ IDEA.
  User: Windboy
  Date: 19/07/2021
  Time: 2:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>WELCOME ,ENTER EMPLOYEE DETAIL</h3>

<form:form method="POST" action="addEmployee" modelAttribute="employee">
<table>
    <tr>
    <td><form:label path="id">Employee ID: </form:label></td>
    <td><form :input path="id"/></td>
    </tr>
    <tr>
        <td>
            <form:label path="name">EmployeeName</form:label>

        </td>
        <td>
            <form:input path="name"></form:input></td>
    </tr>

    <tr>

        <td><form:label path="contactNumber">Contact's number: </form:label></td>
        <td><form:input path="contactNumber"/></td>
    </tr>
    
    <tr>
        <td><input type="submit" value="Submit"></td>
    </tr>
    </table>
</form:form>
</body>
</html>
