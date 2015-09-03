<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Book Manager</title>
</head>
<body>
<div>
  <h1>List users</h1>
  <c:if test = "${!empty users}">
    <table>
      <tr>
        <th>Name</th>
        <th>First Name</th>
        <th>               patronymic</th>
        <th> amountOfMoney</th>
        <th> email</th>
        <th> address</th>
        <th>phoneNumber</th>
        <th>login</th>
        <th>password</th>
        <th>role</th>

      </tr>
      <c:forEach items = "${users}" var = "user">
        <tr>
          <td>${user.firstName}</td>
          <td>${user.lastName}<td>
          <td>${user.patronymic}</td>
          <td>${user.amountOfMoney}<td>
          <td>${user.email}<td>
          <td>${user.address}</td>
          <td>${user.phoneNumber}<td>
          <td>${user.username}
          ${user.password}
          ${user.idRole.toString()}<td>


        </tr>
      </c:forEach>
    </table>
  </c:if>
  <a href="<c:url value="/user/addUser" /> ">
    <label>Регистрация:</label>
  </a>
  <a href="<c:url value="/signup" /> ">
    <label>Login:</label>
</a>
  <a href="<c:url value="/showUser" /> ">
    <label>showUser :</label>
  </a>
  <a href="<c:url value="/user/editUser" /> ">
    <label>editUser :</label>
  </a>
  <a href="<c:url value="/contract" /> ">
    <label>Contract :</label>
  </a>
  <a href="<c:url value="/author" /> ">
    <label>Authors :</label>
  </a>
  <div class="form-group">
    <label> </label>
  </div>
</div>
</body>
</html>