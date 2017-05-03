$(document).ready(function(){
	$("#btnRegistrarCliente").click(function(){
		debugger;
		var codigo = $("#txtCodigo").val();
		var nombres = $("#txtNombres").val();
		var telefono = $("#txtTelefono").val();
		$.ajax({
			url:"/system_comedor/cliente/registrarCliente",
			type:"GET",
			dataType:"text",
			data:{"codigoCliente" : codigo , "nombreCliente" : nombres , "telefono" : telefono},
			success: function(data){
				var obj=JSON.Parse(data);
				alert(obj);
			},
			error:function(data){
				alert("ERROR");
			}
		});
	});
});