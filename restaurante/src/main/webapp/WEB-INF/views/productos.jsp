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
	
	<h1 align="center">${categorias.nombre }</h1>
	
	<br>
	
	<h1 align="center">${categorias.descripcion }</h1>
	
	<br>
	
	<div class="container text-center">
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">Nombre</th>
					<th scope="col">Descripcion</th>
					<th scope="col">Peso</th>
					<th scope="col">Stock</th>
					<th scope="col">Comprar</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="producto" items="${productos}">
					<form action=anadirProducto method="POST">
						<input type="text" name="idCategoria" value="${categorias.codcat }" hidden="hidden">
						<input type="text" name="nombreCategoria" value="${categorias.nombre }" hidden="hidden">
						<input type="text" name="descripcionCategoria" value="${categorias.descripcion }" hidden="hidden">
							<tr>
								<td><input type="text" name="id" value="${producto.codprod }" hidden="hidden"><input type="text" name="nombre" value="${producto.nombre }" readonly="readonly"></td>
								<td><input type="text" name="descripcion" value="${producto.descripcion }" readonly="readonly"></td>
								<td><input type="text" name="peso" value="${producto.peso }" readonly="readonly"></td>
								<td><input type="text" name="stock" value="${producto.stock }" readonly="readonly"></td>
								<td><input type="number" name="unidades" min=1 max="${producto.stock }"></td>
								<td><button class="btn btn-success" type="submit" name="comprar">Comprar</button></td>
							</tr>
					</form>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>