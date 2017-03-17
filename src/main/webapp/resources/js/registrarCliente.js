$(document).ready(function(){
	$("#btnRegistrarCliente").click(function(){
		debugger;
		var codigo = $("#txtCodigo").val();
		var nombres = $("#txtNombres").val();
		var telefono = $("#txtTelefono").val();
		$.ajax({
			url:"/system_comedor/cliente/registrarCliente",
			type:"GET",
			dataType:"json",
			data:{"codigoCliente" : codigo , "nombreCliente" : nombres , "telefono" : telefono},
			success: function(data){
				alert(data);
			},
			error:function(data){
				alert("ERROR");
			}
		});
	});
});