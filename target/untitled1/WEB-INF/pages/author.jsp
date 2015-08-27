<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Autors</title>
</head>
<body>
<h1>List authors</h1>
<c:if test = "${!empty authors}">
  <table>
    <tr>

      <th>Авторы:</th>


    </tr>
    <c:forEach items = "${authors}" var = "author">
      <tr>

        <td>${author.idUser.lastName}   ${author.idUser.firstName} <td><a href="<c:url value="/getContract${author.idUser.idUser}" /> ">
        <label>Мои контракты:</label>
</a>
      </tr>
    </c:forEach>
  </table>
</c:if>
<a href="<c:url value="/contract" /> ">
  <label>все контракты:</label>
</a>
</body>
</html>
