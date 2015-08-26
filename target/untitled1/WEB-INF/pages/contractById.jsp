<%--
  Created by IntelliJ IDEA.
  User: Админ
  Date: 26.08.2015
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>contract by id</h1>
<c:if test = "${!empty contractById}">
  <table>
    <tr>
      <th>idBook</th>
      <th>dateOfPublication</th>
      <th> fullPaymentToTheAuthor</th>
      <th> idContract</th>
      <th> isSigned</th>
      <th> numberOfBooks</th>
      <th>productionCost</th>
      <th>valuePayments</th>

    </tr>

    <tr>
      <td>${contractById.idBook}</td>
      <td>${contractById.dateOfPublication}<td>
      <td>${contractById.fullPaymentToTheAuthor}</td>
      <td>${contractById.idContract}<td>
      <td>${contractById.isSigned}</td>
      <td>${contractById.numberOfBooks}<td>
      <td>${contractById.productionCost}</td>
      <td>${contractById.valuePayments}<td>

    </tr>

  </table>
</c:if>

</body>
</html>
