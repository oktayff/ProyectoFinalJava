<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Lista de categorias</title>
</head>
<body>
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
					<li class="nav-item active"><a class="nav-link"
						href="carrito.jsp">Ver Carrito</a></li>
					<li class="nav-item"><a class="nav-link"
						href="listaCategorias.jsp">Lista de categorías</a></li>
					<li class="nav-item"><a class="nav-link"
						href="listaCategorias.jsp">Cerrar la sesión</a></li>
			</div>
		</nav>
	</div>

	<br>

	<div class="main">
		<div class="container text-center">
			<a href="productos.jsp" id="bebidasCon" name="bebidasCon"
				value="Bebidas con">Bebidas con</a> <br> <a
				href="productos.jsp" id="bebidasSin" name="bebidasSin"
				value="Bebidas sin">Bebidas sin</a> <br> <a
				href="productos.jsp" id="comidas" name="comidas" value="Comidas">Comidas</a>
		</div>
	</div>

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>