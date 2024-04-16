<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Page</title>
<script>
    function redirectToLogin(userType, name) {
        var url = "/user/" + userType + "/" + encodeURIComponent(name);
        window.location.href = url;
    }
</script>
</head>
<body>
    <% String name = (String) request.getAttribute("mail"); %>
    <h1>Welcome to the User Page</h1>
    <h1><%= name %></h1>
    <button onclick="redirectToLogin(1, '<%= name %>')">Book Ticket</button>
    <button onclick="redirectToLogin(2, '<%= name %>')">View My Tickets</button>
</body>
</html>
