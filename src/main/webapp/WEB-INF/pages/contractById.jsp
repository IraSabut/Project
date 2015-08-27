<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<h1>contract by id author</h1>

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
    <th>idAuthorEntity</th>

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
    <td>${contractById.idAuthorEntity.idUser.firstName} ${contractById.idAuthorEntity.idUser.lastName}    <td>

  </tr>

</table>


</body>
</html>
