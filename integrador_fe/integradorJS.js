const PRECIO_TKT = 200;
var descuentos = [80,50,15];

function calc_total() {
	const CATEGORIA = document.getElementById("categoria").value;
	const CANT = document.getElementById("cantidad").value;
	if (CANT != "") {
		total = CANT * (PRECIO_TKT - PRECIO_TKT*(descuentos[CATEGORIA]/100));
		document.getElementById("total").value = "Total a Pagar: $"+total;
	}
	else {
		document.getElementById("total").value = "Por favor ingrese cantidad";
	}
}

function borrar() {
	document.getElementById("cantidad").value = "";
	document.getElementById("total").value = "Total a Pagar: $";
}