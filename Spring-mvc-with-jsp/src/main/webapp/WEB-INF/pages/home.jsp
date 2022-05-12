<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>It's Me Gowse </title>
<style type="text/css">

table{
border: 1px solid black;
}
tr,td,th{
border: 1px solid black;
border-collapse:collapse;
margin: 50px;
}
</style>
</head>
<body>

<marquee behavior=alternate direction =right >
<table>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Price</th>
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td>${eachItem.productId}</td>
<td>${eachItem.productName}</td>
<td>${eachItem.price}</td>
</tr>
</c:forEach>
</table>
</marquee>
</body>
</html>