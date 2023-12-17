document.addEventListener("DOMContentLoaded", function() {
	var idClienteInput = document.getElementById("id_cliente");

	if (idClienteInput) {
		idClienteInput.onclick = function() {
			alert("Campo não editável. Preencha os campos abaixo.");
			// Preencher os campos subsequentes, se necessário
		};
	}
});


function validar() {
	var nome = document.getElementById("nomecompleto").value;
	var endereco = document.getElementById("endereco").value;
	var cep = document.getElementById("cep").value;
	var cpf = document.getElementById("cpf").value;
	var email = document.getElementById("e_mail").value;
	var senha = document.getElementById("senha").value;
	var telefone = document.getElementById("telefone").value;


	// Validar se o nome não está vazio e tem pelo menos 4 caracteres e não contém números
	if (nome.trim() === "") {
		alert("Por favor, preencha o campo 'Nome completo'.");
		return false;
	} else if (nome.length < 4 || /\d/.test(nome)) {
		alert("O campo 'Nome completo' deve ter pelo menos 4 caracteres e não pode conter números.");
		return false;
	}


	// Validar se o nome não está vazio
	if (nome.trim() === "") {
		alert("Por favor, preencha o campo 'Nome completo'.");
		return false;
	}

	// Validar se o endereço não está vazio
	if (endereco.trim() === "") {
		alert("Por favor, preencha o campo 'Endereço'.");
		return false;
	}

	// Validar se o endereço não está vazio, tem pelo menos 3 caracteres e contém pelo menos duas letras
	if (endereco.trim() === "") {
		alert("Por favor, preencha o campo 'Endereço'.");
		return false;
	} else if (endereco.length < 3 || (endereco.match(/[a-zA-Z]/g) || []).length < 2) {
		alert("O campo 'Endereço' deve ter pelo menos 3 caracteres e conter pelo menos duas letras.");
		return false;
	}
	
	
	
	// Validação de CEP
	if (!/^\d{6,12}$/.test(cep)) {
		alert("CEP inválido. O CEP deve conter de 6 a 12 dígitos apenas numéricos.");
		return false;
	}

	// Validação de CPF
	if (!/^\d{4,11}$/.test(cpf)) {
		alert("CPF inválido. O CPF deve conter de 4 a 11 dígitos apenas numéricos.");
		return false;
	}

	// Verificação de letras ou caracteres especiais no CPF
	if (!/^\d+$/.test(cpf)) {
		alert("CPF inválido. O CPF deve conter apenas números.");
		return false;
	}

	// Validação de e-mail
	if (!/\S+@\S+\.\S+/.test(email)) {
		alert("E-mail inválido. O e-mail deve estar no formato correto (exemplo@dominio.com).");
		return false;
	}

	// Validação de e-mail duplicado (você deve implementar a lógica de consulta ao banco de dados)
	if (emailJaExisteNoBanco(email)) {
		alert("E-mail já cadastrado. Use um e-mail diferente.");
		return false;
	}


	// Validação de e-mail
	if (!/\S+@\S+\.\S+/.test(email) || email.indexOf("@") === -1 || email.indexOf(".com") === -1) {
		alert("E-mail inválido. O e-mail deve estar no formato correto (exemplo@dominio.com).");
		return false;
	}




	// Validação de senha

	if (senha.length < 6) {
		alert("Senha inválida. A senha deve conter no mínimo 6 caracteres.");
		return false;
	}



	// Validação de número de telefone
	if (!/^\d{8,15}$/.test(telefone)) {
		alert("Número de telefone inválido. O número deve conter no mínimo 8 digitos e no máximo 15 dígitos numéricos.");
		return false;
	}

	// Verificação de letras ou caracteres especiais no telefone
	if (!/^\d+$/.test(telefone)) {
		alert("Número de telefone inválido. O número deve conter apenas números.");
		return false;
	}



	// Implemente outras validações, se necessário

	return true;
}

function emailJaExisteNoBanco(email) {
	// Aqui, você deve implementar a lógica para verificar se o e-mail já existe no banco de dados.
	// Se o e-mail existir, retorne true; caso contrário, retorne false.
	// Esta função simula a lógica; você deve adaptá-la para seu ambiente e tecnologias de banco de dados.
	var emailsCadastrados = ["email1@example.com", "email2@example.com"]; // Substitua por sua lista de e-mails cadastrados
	return emailsCadastrados.includes(email);
}
