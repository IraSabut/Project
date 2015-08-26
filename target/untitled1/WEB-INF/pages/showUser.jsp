<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show user</title>
</head>
<body>
<h1>user by id</h1>
<c:if test = "${!empty showUser}">
  <table>
    <tr>
      <th>Name</th>
      <th>First Name</th>
      <th>               patronymic</th>
      <th> amountOfMoney</th>
      <th> email</th>
      <th> address</th>
      <th>phoneNumber</th>

    </tr>

      <tr>
        <td>${showUser.firstName}</td>
        <td>${showUser.lastName}<td>
        <td>${showUser.patronymic}</td>
        <td>${showUser.amountOfMoney}<td>
        <td>${showUser.email}<td>
        <td>${showUser.address}</td>
        <td>${showUser.phoneNumber}<td>
      </tr>

  </table>
</c:if>
</body>
</html>
