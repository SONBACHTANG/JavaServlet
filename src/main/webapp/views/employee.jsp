<%--
  Created by IntelliJ IDEA.
  User: PC-SON
  Date: 10/19/2023
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Add new</title>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Student</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
</head>
<body>
<form action='save_user' method='post'>
    <div class="form-group">
        <label >Name:</label>
        <input type="text" class="form-control" name="userName">
    </div>
    <div class="form-group">
        <label for="email">Email:</label>
        <input type="text" class="form-control" name="email" id="email">
    </div>
    <div class="form-group">
        <label >Phone:</label>
        <input type="text" class="form-control" name="phone">
    </div><br>
    <input type='submit' value='Submit'/>
</form>
</body>
</html>
