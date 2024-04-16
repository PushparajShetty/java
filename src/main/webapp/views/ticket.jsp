<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Ticket</title>
</head>
<body>
<%
List<String> stations = (List<String>) request.getAttribute("station");
%>
    <h1>Book Ticket</h1>
    <h1>${mail}</h1>
    <form action="/user/book/${mail}" method="post" onsubmit="return validateForm()">
        <label for="from">From:</label>
        <select id="from" name="from" required>
            <option value="">Select From</option>
            <% for (String station : stations) { %>
                <option value="<%= station %>"><%= station %></option>
            <% } %>
        </select>
        <br>
        <label for="to">To:</label>
        <select id="to" name="to"  required>
            <option value="">Select To</option>
            <% for (String station : stations) { %>
                <option value="<%= station %>"><%= station %></option>
            <% } %>
        </select>
        <br>
        <input type="submit" value="Book">
    </form>
    
    <%-- JavaScript to check if 'From' and 'To' are same --%>
    <script>
        function validateForm() {
            var from = document.getElementById("from").value;
            var to = document.getElementById("to").value;
            if (from === to) {
                alert("From and To cannot be the same");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>
