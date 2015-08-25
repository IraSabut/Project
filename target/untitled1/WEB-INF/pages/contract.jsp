<%--
  Created by IntelliJ IDEA.
  User: Админ
  Date: 25.08.2015
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
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
      </tr>
    </c:forEach>
  </table>
</c:if>
</body>
</html>
