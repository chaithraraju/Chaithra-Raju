<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
out.println("welcome "+session.getAttribute("name")+"!!");
%> 

<br>
<a href="CheckBalance">Check Balance...</a>
<br>
<a href="/BankApp/transferMoney.html">Transfer Money</a>
<br><br>
<a href="TransferHistory">Transfer History</a>
<br>
<br>
<a href="changeDetails.html">change Details</a>
<br>
<a href="Logout">Logout</a>
</body>
</html>