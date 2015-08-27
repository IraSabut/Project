<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>List contracts</h1>
<c:if test = "${!empty contracts}">
  <table>
    <tr>
      <th>idContract</th>
      <th>dateOfPublication</th>
      <th>fullPaymentToTheAuthor</th>
      <th> idBook</th>
      <th> isSigned</th>
      <th> numberOfBooks</th>
      <th>productionCost</th>
      <th>valuePayments</th>
      <th>idAuthorEntity</th>


    </tr>
    <c:forEach items = "${contracts}" var = "contract">
      <tr>
        <td>${contract.idContract}</td>
        <td>${contract.dateOfPublication}<td>
        <td>${contract.fullPaymentToTheAuthor}</td>
        <td>${contract.idBook}<td>
        <td>${contract.isSigned}<td>
        <td>${contract.numberOfBooks}</td>
        <td>${contract.productionCost}<td>
        <td>${contract.valuePayments}<td>
        <td>${contract.idAuthorEntity.idUser.firstName}   ${contract.idAuthorEntity.idUser.lastName}  <td>
      </tr>
    </c:forEach>
  </table>
</c:if>
<a href="<c:url value="/hello" />
  <label>Login:</label>
</a>
</body>
</html>
