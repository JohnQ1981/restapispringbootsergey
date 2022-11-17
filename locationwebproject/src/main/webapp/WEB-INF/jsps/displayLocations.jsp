<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Locations</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi John</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>

<table>
<tr>
<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>

</tr>
<c:forEach items="${locations}" var="location">
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>

<td><a href="deleteLocation?id=${location.id}">Delete Location</a>
<td><a href="showUpdate?id=${location.id}">Edit Location</a>
</tr>
</c:forEach>
</table>

<a href="showCreate">Add Location</a>
</body>
</html>