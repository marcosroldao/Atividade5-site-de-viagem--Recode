function validarpassagem() {
	// Obtenha os valores dos campos do formulário
	var destino = document.getElementById("Destino").value;
	var dataIda = document.getElementById("Data_de_ida").value;
	var dataVolta = document.getElementById("Data_de_volta").value;
	var empresa = document.getElementById("Empresa").value;
	var horarioIda = document.getElementById("Horario_da_ida").value;
	var horarioVolta = document.getElementById("Horario_da_volta").value;

	// Verifique se todos os campos estão preenchidos
	if (destino === "" || dataIda === "" || dataVolta === "" || empresa === "" || horarioIda === "" || horarioVolta === "") {
		alert("Por favor, preencha todos os campos.");
		return false;
	}

	// Verifica se a data de ida não é posterior à data de volta
	if (new Date(dataIda) > new Date(dataVolta)) {
		alert("A data de ida não pode ser posterior à data de volta.");
		return false;
	}

	// Verifica se o destino contém pelo menos 4 caracteres e letras e/ou números
	if (destino.length < 4 || !/^[a-zA-Z0-9]+$/.test(destino)) {
		alert("O destino deve ter pelo menos 4 caracteres e conter apenas letras e/ou números.");
		return false;
	}

	// Verifica se a empresa contém pelo menos 3 caracteres, letras e/ou números, incluindo espaços
	if (empresa.length < 3 || !/^[a-zA-Z0-9\s]+$/.test(empresa)) {
		alert("A empresa deve ter pelo menos 4 caracteres e conter apenas letras, números e espaços.");
		return false;
	}


	return true;
}

// Restante do seu código...
