<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<img src="pieChart.jpeg"/>

<form action ="saveLoc" method="post"/>
<pre>
Id: <input type="text" name="id"/>
Code:<input type="text" name="code"/>
Name:<input type="text" name="name"/>


Type:Urban <input type="radio" name ="type" value="URBAN"/>
	 Rural <input type="radio" name ="type" value="RURAL"/>
	<input type="submit" value="save"/>
	
	</pre>
</form>
${msg}
<a href="displayLocations">View All</a>

</body>
</html>