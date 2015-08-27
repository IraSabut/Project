<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Sign Up</h1>

<form:form method="post" commandName="signupForm">
  <table>
    <tr>
      <td>Username:</td>
      <td><form:input path="idAutorizationData.login" /></td>
          </tr>

    <tr>
      <td>Password:</td>
      <td><form:password path="idAutorizationData.password" /></td>
        </tr>




      <td colspan="3"><input type="submit" value="Submit" /></td>
    </tr>
  </table>
</form:form>


</body>
</html>
