<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<script>
function redirectToLogin(userType) {
    var url = "/view/" + userType;
    window.location.href = url;
}
</script>
</head>
<body>
    <h1>Welcome to the Admin Page</h1>
    <button onclick="redirectToLogin(1)">Route</button>
    <button onclick="redirectToLogin(2)">Station</button>
    <button onclick="redirectToLogin(3)">Metro</button>
    
</body>
</html>
