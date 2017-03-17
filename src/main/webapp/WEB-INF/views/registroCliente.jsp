<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Cliente</title>
<script src="<c:url value="/resources/js/registroCliente.js" />"></script>
</head>
<body>
	<table>
		<tr>
			<td>DNI</td>
			<td>:</td>
			<td>
				<input id="txtDni" name="txtDni"  type="text" />
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
			<td>Apellido</td>
			<td>:</td>
			<td>
				<input id="txtApellido" name="txtApellido" type="text" />
			</td>
		</tr>
		<tr>
			<td colspan="3"> 
				<button id="btnRegistrarCliente" value="REGISTRAR"></button>
			</td>
		</tr>
	</table>
</body>
</html>