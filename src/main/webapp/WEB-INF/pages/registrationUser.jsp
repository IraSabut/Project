<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title></title>
</head>
<body>
<form:form method="post" action="/author/addBookPost" commandName="book" >
    <table>
        <tr>
            <td>
                <form:label path="">
                    Название книги
                </form:label>
            </td>
            <td>
                <form:input path="nameBook"/>
            </td>

        </tr>
        <tr>
            <td>
                <form:label path="numberOfPages">
                    Количество страниц
                </form:label>
            </td>
            <td>
                <form:input path="numberOfPages"/>
            </td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="Добавить"/></td>
        </tr>
    </table>
</form:form>


    <tr>
      <td colspan="2"><input type="submit" value="Регистрация"/></td>
    </tr>



</body>
</html>
