<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form action="companyShare" method="post" modelAttribute="companyRecord">
			<h2>
				
				<form:input type="hidden" path="companyId" value="00"/>
				Enter Company Name: <form:input type="text" name="name" path="companyName"/>
				<br> <br> 
				Enter the Share price: <form:input type="text" name="share" path="sharePrice"/>
				<br> <br> 
				
				<input type="submit" value="submit">
				<br> <br>
			</h2>
		</form:form>
	</div>
</body>
</html>