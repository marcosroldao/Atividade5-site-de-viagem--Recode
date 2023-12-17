function updatepassagem() {
    // Obtenha os valores dos campos do formulário
    var destino = document.getElementById("destino").value;
    var Data_de_ida = document.getElementById("data_de_ida").value;
    var Data_de_volta = document.getElementById("data_de_volta").value;
    var empresa = document.getElementById("empresa").value;
    var horarioIda = document.getElementById("horario_da_ida").value;
    var horarioVolta = document.getElementById("horario_da_volta").value;

    // Verifique se todos os campos estão preenchidos
    if (destino === "" || Data_de_ida === "" || Data_de_volta === "" || empresa === "" || horarioIda === "" || horarioVolta === "") {
        alert("Por favor, preencha todos os campos.");
        return false;
    }

    // Verifique se destino e empresa têm pelo menos 4 caracteres e contêm letras
    if (!validarTamanhoCaracteres(destino, 4) || !contemLetras(destino)) {
        alert("Destino deve ter pelo menos 4 caracteres e conter letras.");
        return false;
    }

    if (!validarTamanhoCaracteres(empresa, 4) || !contemLetras(empresa)) {
        alert("Empresa deve ter pelo menos 4 caracteres e conter letras.");
        return false;
    }

    // Verifique se a data de volta não é anterior à data de ida
    if (new Date(Data_de_volta) < new Date(Data_de_ida)) {
        alert("A data de volta não pode ser anterior à data de ida.");
        return false;
    }
}

// Função para validar o tamanho mínimo de caracteres
function validarTamanhoCaracteres(valor, tamanhoMinimo) {
    return valor.length >= tamanhoMinimo;
}

// Função para verificar se uma string contém letras
function contemLetras(valor) {
    var regexLetras = /[a-zA-Z]/;
    return regexLetras.test(valor);
}
