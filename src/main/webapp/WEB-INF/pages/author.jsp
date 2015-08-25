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
      <th>idAuthor</th>
      <th>idUser</th>


    </tr>
    <c:forEach items = "${authors}" var = "author">
      <tr>
        <td>${author.idAuthor}</td>
        <td>${author.idUser}<td>

      </tr>
    </c:forEach>
  </table>
</c:if>
</body>
</html>
