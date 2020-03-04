<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.proyecto.springboot.dto.RestaurantesDTO"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Home</title>
</head>
<body>

	<h1 align="center">LOGIN</h1><br>
	
	<div class="container" align="center">
		<form:form action="listaCategorias" modelAttribute="restaurantes">
		
			EMAIL: <form:input type="email" path="correo" /><br>
			<br>
			PASSWORD: <form:input type="password" path="clave" name="password" /><br>
			<br>
			<input class="btn btn-warning" type="submit" value="Log In">
			
		</form:form>
		
		<p> ${msg }</p>
		
	</div>
	
	
<%--     <form:form action="listaCategorias" modelAttribute="restaurantes"> --%>
<%--         First name: <form:input path="correo" />          --%>
<!--         <br><br>   -->
<%--         Last name: <form:input path="clave" />   --%>
<!--         <br><br>   -->
<!--         <input type="submit" value="Submit" />       -->
<%--     </form:form> --%>
<%--     <p>${msg }</p> --%>
    
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>