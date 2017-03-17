<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Cliente</title>
<script src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
<script src="<c:url value="/resources/js/registrarCliente.js" />"></script>
</head>
<body>
	<table>
		<tr>
			<td>Codigo</td>
			<td>:</td>
			<td>
				<input id="txtCodigo" name="txtCodigo"  type="text" />
			</td>
		</tr>
		<tr>
			<td>Nombres</td>
			<td>:</td>
			<td>
				<input id="txtNombres" name="txtNombres" type="text" />
			</td>
		</tr>
		<tr>
			<td>Telefono</td>
			<td>:</td>
			<td>
				<input id="txtTelefono" name="txtTelefono" type="text" />
			</td>
		</tr>
		<tr>
			<td colspan="3"> 
				<button id="btnRegistrarCliente" type="submit">REGISTRAR</button>
			</td>
		</tr>
	</table>
</body>
</html>