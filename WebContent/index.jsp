<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Days counter</title>
</head>
<body>
	<form action="monthsServlet" method="GET">
		Month: <input type="text" name="month"> <input type="submit"
			value="show how many days!" />
	</form>
</body>
</html>