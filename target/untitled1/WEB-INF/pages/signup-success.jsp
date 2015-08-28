
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
  <title>Successfull Sign Up</title>
</head>
<body>
<h1>Successfull Sign Up</h1>
<td>${user.firstName}</td>
<td>${user.lastName}<td>
<td>${user.patronymic}</td>
<td>${user.amountOfMoney}<td>
<td>${user.email}<td>
<td>${user.address}</td>
<td>${user.phoneNumber}<td>
<th>idAutorizationData.login</th>


<td>${user.idAutorizationData.login} <th>user.idAutorizationData.password</th> ${user.idAutorizationData.password} <th>user.idAutorizationData.role</th> <td>

<p>Congratulations! Your signup was successful</p>

<a href="${pageContext.request.contextPath}/" title="Home">Home</a>
</body>
</html>