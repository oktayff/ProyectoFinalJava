<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.proyecto.springboot.dto.RestaurantesDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Productos</title>
</head>
<body>
	<% RestaurantesDTO user = (RestaurantesDTO) session.getAttribute("user"); %>

	<div class="header">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link"
						href=verCategorias>Home</a>
					</li>
					<li class="nav-item active"><a class="nav-link"
						href=mostrarCarrito>Ver Carrito</a>
					</li>
					<li class="nav-item"><%= user.getCorreo()%><a class="nav-link"
						href=closeSession>Cerrar la sesión</a>
					</li>
				</ul>
			</div>
		</nav>
	</div>

	<br>
	
	${msg }

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>