<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Balance Details</h2>
<%
out.println("Name :"+
session.getAttribute("name")
+"<br>"+"Accno : "
+session.getAttribute("accno")
+"<br>"+"Balance : "
+session.getAttribute("balance"));
%>
</center>
</body>
</html>