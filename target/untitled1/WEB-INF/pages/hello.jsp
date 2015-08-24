<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Book Manager</title>
</head>
<body>
<div>
    <h1>BookManager</h1>
    <c:if test = "${!empty books}">
        <table>
            <tr>
                <th>Name</th>
                <th>Annotation</th>
            </tr>
            <c:forEach items = "${books}" var = "book">
                <tr>
                    <td>${book.nameBook}</td>
                    <td>${book.annotation}<td>
                </tr>
            </c:forEach>
        </table>
    </c:if>


    <h1>List users</h1>
    <c:if test = "${!empty users}">
        <table>
            <tr>
                <th>Name</th>
                <th>Login</th>
            </tr>
            <c:forEach items = "${users}" var = "user">
                <tr>
                    <td>${user.lastName}</td>
                    <td>${user.firstName}<td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <div class="form-group">
        <label for="login" class="col-sm-4 control-label">Login:</label>
        <div class="col-sm-8">
            <input type="text" id="login" name="login" class="form-control" placeholder="Enter login">
        </div>
        <label for="password" class="col-sm-4 control-label">Password:</label>
        <div class="col-sm-8">
            <input type="text" id="password" name="password" class="form-control" placeholder="Enter password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-8">
            <input name="submit" type="submit" class="btn btn-primary" value=" Sign In " />
        </div>
    </div>
    <div class="form-group">
        <label> </label>
    </div>
</div>
</body>
</html>