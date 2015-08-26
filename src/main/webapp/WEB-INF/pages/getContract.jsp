<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<h1>contract by author</h1>

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
<c:forEach items = "${contracts}" var = "contract">
    <tr>
      <td>${contract.idBook}</td>
      <td>${contract.dateOfPublication}<td>
      <td>${contract.fullPaymentToTheAuthor}</td>
      <td>${contract.idContract}<td>
      <td>${contract.isSigned}</td>
      <td>${contract.numberOfBooks}<td>
      <td>${contract.productionCost}</td>
      <td>${contract.valuePayments}<td>

    </tr>
</c:forEach>
  </table>


</body>
</html>
