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
<div class="container mt-3 col-5 justify-content-center">
    <form class="justify-content-center p-4 border ">
        <h2>Register</h2>
        <div class="mb-3">
            <label for="fullName" class="form-label">Email address</label>
            <input type="Full names" class="form-control" id="fullName" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <input type="email" class="form-control" id="email" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password">
        </div>
        <div class="d-flex flex-row justify-content-center gap-3">
            <p> Gender </p>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="exampleRadios1" value="female" checked>
                <label class="form-check-label" for="exampleRadios1">
                    Female
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="exampleRadios2" value="male">
                <label class="form-check-label" for="exampleRadios2">
                    Male
                </label>
            </div>
        </div>
        <div class="d-flex flex-row justify-content-center">
            <button type="submit" class="btn btn-primary">Register</button>
        </div>
        <div class="mt-4">
            <a class="" href="login.jsp">Already have an account? Login</a>
        </div>
    </form>
</div>
</body>
</html>
