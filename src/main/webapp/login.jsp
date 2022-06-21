<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 6/21/2022
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container col-5 justify-content-center">
    <form class="border p-4 mt-3" action="/student_management_system_war/AdminController" method="post">
        <h2>Login</h2>
        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <input type="email" class="form-control" id="email" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password">
        </div>
        <div class="d-flex flex-row justify-content-center">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
        <div class="mt-4">
            <a class="" href="register.jsp">Don't have an account? Sign up</a>
        </div>
    </form>
</div>
</body>
</html>
