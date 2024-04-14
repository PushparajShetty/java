<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<script>
    function redirectToLogin(userType) {
        var url = "/login/" + userType;
        window.location.href = url;
    }
</script>
</head>
<body>
    <h1>Welcome to the Home Page</h1>
    <button onclick="redirectToLogin(1)">User</button>
    <button onclick="redirectToLogin(0)">Admin</button>
</body>
</html>
