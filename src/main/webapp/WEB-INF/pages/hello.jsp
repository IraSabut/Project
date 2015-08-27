<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>

</head>
<body>
<div>




    <div class="form-group">
        <label for="login" class="col-sm-4 control-label">Login:</label>
        <div class="col-sm-8">
            <input type="text" id="login" name="login" class="form-control" placeholder="Enter login">
        </div>
        <label for="password" class="col-sm-4 control-label">Password:</label>
        <div class="col-sm-8">
            <input type="text" id="password" name="password" class="form-control" placeholder="Enter password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-8">
            <input name="submit" type="submit" class="btn btn-primary" value=" Sign In " />
        </div>
    </div>
    <div class="form-group">
        <label> </label>
    </div>
</div>
</body>
</html>