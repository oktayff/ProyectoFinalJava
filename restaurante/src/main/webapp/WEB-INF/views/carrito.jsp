<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Carrito</title>
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
	
	<div class="container text-center">
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">Nombre</th>
				<th scope="col">Descripcion</th>
				<th scope="col">Peso</th>
				<th scope="col">Unidades</th>
				<th scope="col">Eliminar</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>Mark</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td><select id="numProd">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>
				<td><button class="btn btn-primary" type="submit"
						name="comprar">Eliminar</button></td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
				<td><select id="numProd">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>
				<td><button class="btn btn-primary" type="submit"
						name="comprar">Eliminar</button></td>
			</tr>
			<tr>
				<th scope="row">3</th>
				<td>Larry</td>
				<td>the Bird</td>
				<td>@twitter</td>
				<td><select id="numProd">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>

				<td><button class="btn btn-primary" type="submit"
						name="comprar">Eliminar</button></td>
			</tr>
		</tbody>
	</table>
	</div>
	
	<br>
	
	<div class="container text-center">
		<a href="">Realizar pedido</a>
	
	<br>
	
		<a href="index.jsp">Ir a la página de login</a>
	</div>
	
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>