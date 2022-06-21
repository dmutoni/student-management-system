<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 6/21/2022
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String error = (String) session.getAttribute("error");
    session.removeAttribute("error");
    String message = (String) session.getAttribute("message");
    session.removeAttribute("message");
%>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container mt-3 col-5 justify-content-center">
    <form class="justify-content-center p-4 border" action="AdminController?action=register" method="POST">
        <h2>Register</h2>
        <div class="mb-3">
            <label for="fullName" class="form-label">Full name</label>
            <input type="Full names" required name="fullName" class="form-control" id="fullName"
                   aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <input type="email" required name="email" class="form-control" id="email" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" required name="password" class="form-control" id="password">
        </div>
        <div class="mb-3">
            <label for="cpassword" class="form-label">Confirm password</label>
            <input type="password" required name="cpassword" class="form-control" id="cpassword">
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
        <% if(error!=null){ %>
        <div class="py-3 d-flex flex-row justify-content-center">
            <p class="text-danger"> <%= error %> </p>
        </div>
        <% } %>
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
