<%--
  Created by IntelliJ IDEA.
  User: PC-SON
  Date: 10/25/2023
  Time: 5:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>

<html lang="vi">

<head>

    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Student</title>


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

</head>
<body class="container">
<h2><a href="./formadd">Add New</a></h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Họ Tên</th>
        <th scope="col">Số Điện Thoại</th>
        <th scope="col">Email</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items ="${list1}" var="u">

    <tr>

        <td>${u.id}</td>
        <td>${u.name}</td>
        <td>${u.phone}</td>
        <td>${u.email}</td>
        <td>
            <a href="/demo//AddnewServlet-servlet?id=${u.id}">Update</a>
            <a href="./delete?id=${u.id}">Delete</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>

</html>

