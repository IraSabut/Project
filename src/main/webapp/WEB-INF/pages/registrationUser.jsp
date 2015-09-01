<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title></title>
</head>
<body>
<c:url  value="/user/addUser" />
<form:form method="post" action="${saveUrl}" commandName="user" >
    <table>
        <tr>
            <td>
                <form:label path="idAutorizationData.login">
                   Логин
                </form:label>
            </td>
            <td>
                <form:input path="idAutorizationData.login"/>
            </td>

        </tr>

        <tr>
            <td>
                <form:label path="idAutorizationData.password">
                    Пароль
                </form:label>
            </td>
            <td>
                <form:input path="idAutorizationData.password"/>
            </td>

        </tr>

        <tr>
            <td>
                <form:label path="amountOfMoney">
                    Количество денег на счету
                </form:label>
            </td>
            <td>
                <form:input path="amountOfMoney"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="firstName">
                 Имя
                </form:label>
            </td>
            <td>
                <form:input path="firstName"/>
            </td>
        </tr>


        <tr>
            <td>
                <form:label path="lastName">
              Фамилия
                </form:label>
            </td>
            <td>
                <form:input path="lastName"/>
            </td>
        </tr><tr>
        <td>
            <form:label path="patronymic">
               Отчество
            </form:label>
        </td>
        <td>
            <form:input path="patronymic"/>
        </td>
    </tr>
        <tr>
            <td>
                <form:label path="phoneNumber">
                    phoneNumber
                </form:label>
            </td>
            <td>
                <form:input path="phoneNumber"/>
            </td>
        </tr>


        <tr>
            <td>
                <form:label path="idAutorizationData.role">
                    idAutorizationData.idRole
                </form:label>
            </td>
            <td>
                <form:input path="idAutorizationData.role"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="address">
                    Адрес
                </form:label>
            </td>
            <td>
                <form:input path="address"/>
            </td>
        </tr>




        <tr>
            <td>
                <form:label path="email">
                    Электронный адрес
                </form:label>
            </td>
            <td>
                <form:input path="email"/>
            </td>
        </tr>



        <tr>
            <td colspan="2"><input type="submit" value="Добавить"/></td>
        </tr>
    </table>
</form:form>






</body>
</html>
