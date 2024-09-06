<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="welcome.jsp">

		Name<input type="text" name="user" /> 
			<input type="submit" name="go" value="Click me" />
	</form>
	<br>
	<%! int n = 50; %>
	<%= "Value of variable is =" + n %>
	<br>
	<%! int cube(int n){return n*n*n;} %>
	<%= "Cube of 3 is = "+cube(3) %>
	
</body>
</html>