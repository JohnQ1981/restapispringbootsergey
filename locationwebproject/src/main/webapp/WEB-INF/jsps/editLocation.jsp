<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Location</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi John</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>

<form action ="editLoc" method="post"/>
<pre>
Id: <input type="text" name="id" value="${location.id}" readonly/>
Code:<input type="text" name="code" value="${location.code}"/>
Name:<input type="text" name="name" value="${location.name}"/>


Type:Urban <input type="radio" name ="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
	 Rural <input type="radio" name ="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
	<input type="submit" value="save"/>
	
	</pre>
</form>


</body>
</html>