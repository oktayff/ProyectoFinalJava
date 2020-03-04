<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.proyecto.springboot.dto.RestaurantesDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Carrito</title>
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
					<li class="nav-item"><a class="nav-link"
						href=closeSession>Cerrar la sesión</a>
					</li>
			</div>
		</nav>
	</div>

	<br>
	
	<h1 align="center">Carrito</h1>
	
	<div class="container text-center">
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">Nombre</th>
					<th scope="col">Descripcion</th>
					<th scope="col">Peso</th>
					<th scope="col">Stock</th>
					<th scope="col">Unidades</th>
					<th scope="col">Eliminar</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="productoAnadido" items="${carrito }">
					<form action=eliminarUnidades method="POST">
						<tr>
							<td><input type="number" name="id" value="${productoAnadido.fkcodprod.codprod }" hidden="hidden"><input type="text" name="nombre" value="${productoAnadido.fkcodprod.nombre }" readonly="readonly">
							<td><input type="text" name="descripcion" value="${productoAnadido.fkcodprod.descripcion }" readonly="readonly"></td>
							<td><input type="number" name="peso" value="${productoAnadido.fkcodprod.peso }" readonly="readonly"></td>
							<td><input type="number" name="stock" value="${productoAnadido.fkcodprod.stock }" readonly="readonly"></td>
							<td><input type="number" name="unidadesProd" value="${productoAnadido.unidades }" readonly="readonly"></td>
							<td><input type="number" name="unidades" min=1 max="${productoAnadido.unidades }"></td>
							<td><button class="btn btn-danger" type="submit" name="eliminar">Eliminar</button></td>
						</tr>	
					</form>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<br>
	
	<div class="container text-center">
		<a href=realizarPedido>Realizar pedido</a>
	
	<br>
	
		<a href=verCategorias>Ir a la página principal</a>
	</div>
	
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>