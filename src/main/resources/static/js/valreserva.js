
function valreserva() {
	// Obtenha os valores dos campos do formulário
	var origem = document.getElementById("Origem").value;
	var destino = document.getElementById("Destino").value;
	var Data_de_ida = document.getElementById("Data_de_ida").value;
	var Data_de_volta = document.getElementById("Data_de_volta").value;
	var preco = document.getElementById("Preco").value;

	// Verifique se todos os campos estão preenchidos
	if (origem === "" || destino === "" || Data_de_ida === "" || Data_de_volta === "" || preco === "") {
		alert("Por favor, preencha todos os campos obrigatórios e clique em 'Ver valor'.");
		return false;
	}

	// Validar se a origem não está vazia e tem pelo menos 4 caracteres e não contém números
	if (origem.trim() === "") {
		alert("Por favor, preencha o campo 'Cidade de partida'.");
		return false;
	} else if (origem.length < 4 || /\d/.test(origem)) {
		alert("O campo 'Cidade de partida' deve ter pelo menos 4 caracteres e não pode conter números.");
		return false;
	}

	// Validar se o destino não está vazio e tem pelo menos 4 caracteres e não contém números
	if (destino.trim() === "") {
		alert("Por favor, preencha o campo 'Destino'.");
		return false;
	} else if (destino.length < 4 || /\d/.test(destino)) {
		alert("O campo 'Destino' deve ter pelo menos 4 caracteres e não pode conter números.");
		return false;
	}

	// Verifica o formato das datas (ano-mes-dia)
	if (!validarFormatoData(Data_de_ida) || !validarFormatoData(Data_de_volta)) {
		alert("Formato de data inválido. Use o formato ano-mes-dia e utilize hífen (exemplo: 2023-12-31).");
		return false;
	}

	if (Data_de_ida > Data_de_volta) {
		alert("A data de ida não pode ser posterior à data de volta.");
		return false;
	}



  // Verifique se a data de ida não é posterior à data de volta
    if (new Date(Data_de_ida) > new Date(Data_de_volta)) {
        alert("A data de ida não pode ser posterior à data de volta.");
        return false;
    }
	// Converte as datas para objetos Date
	var dataIdaObj = new Date(Data_de_ida);
	var dataVoltaObj = new Date(Data_de_volta);

	// Compara as datas
	if (dataIdaObj > dataVoltaObj) {
		alert("A data de volta não pode ser anterior à data de ida.");
		return false;
	}

	// Ativa o botão "Criar Reserva" após verificar todos os campos
	$("#criarReservaBtn").prop("disabled", false);

	return true;
}

// Função para preencher o campo "Preço" com um valor aleatório entre 1500 e 3500 reais
function preencherPrecoAleatorio() {
	// Gera um valor aleatório entre 1500 e 3500
	var preco = Math.floor(Math.random() * (3500 - 1500 + 1)) + 1500;

	// Preenche o campo "Preço" com o valor gerado
	$("#Preco").val(preco);
}

// Chama a função ao carregar a página
$(document).ready(function() {
	// Adiciona um evento de clique ao botão "Ver preço"
	$("#gerarPrecoBtn").click(function() {
		// Verifica se todos os campos obrigatórios estão preenchidos antes de gerar o preço
		preencherPrecoAleatorio();
	});

	// Desativa inicialmente o botão "Criar Reserva"
	$("#criarReservaBtn").prop("disabled", true);

	// Adiciona um evento de clique ao botão "Criar Reserva"
	$("#criarReservaBtn").click(function() {
		// Coloque aqui a lógica de criação da reserva
		// ...
		alert("Reserva criada com sucesso!");
	});
});
