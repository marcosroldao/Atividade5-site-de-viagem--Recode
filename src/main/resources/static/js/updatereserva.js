function updatereserva() {
    var idReserva = document.getElementById("id_reserva");
    var origem = document.getElementById("origem").value;
    var destino = document.getElementById("destino").value;
    var data_de_ida = document.getElementById("data_de_ida").value;
    var data_de_volta = document.getElementById("data_de_volta").value;
    var preco = document.getElementById("preco").value;

    // Verifica se o campo id_reserva está sendo editado
    if (idReserva.hasAttribute("contenteditable")) {
        alert("Você não pode modificar o ID de reserva.");
        return false;
    }

    // Verifique se nenhum campo obrigatório está em branco
    if (origem === "" || destino === "" ||data_de_ida === "" || data_de_volta === "" || preco === "") {
        alert("Por favor, preencha todos os campos obrigatórios.");
        return false;
    }


    // Verifique se origem e destino têm pelo menos 4 caracteres e contêm letras
    if (!contemLetras(origem) || origem.length < 4) {
        alert("O campo 'Cidade de partida' deve ter pelo menos 4 caracteres e conter letras.");
        return false;
    }

    if (!contemLetras(destino) || destino.length < 4) {
        alert("O campo 'Destino' deve ter pelo menos 4 caracteres e conter letras.");
        return false;
    }



  // Verifique se a data de ida não é posterior à data de volta
    if (new Date(data_de_ida) > new Date(data_de_volta)) {
        alert("A data de ida não pode ser posterior à data de volta.");
        return false;
    }
 
 

 

    // Verifique se o preço é um número válido
    if (isNaN(preco)) {
        alert("Preço deve ser um número válido.");
        return false;
    }


     // Verifique se o preço tem pelo menos 3 caracteres e é um número inteiro
    if (preco.length < 3 || !Number.isInteger(Number(preco))) {
        alert("O campo 'Preço' deve ter pelo menos 3 caracteres e conter um número inteiro.");
        return false;
    }

    // Outras validações específicas podem ser adicionadas aqui

    return true;
}




// Função auxiliar para verificar se uma string contém letras
function contemLetras(str) {
    return /[a-zA-Z]/.test(str);
}