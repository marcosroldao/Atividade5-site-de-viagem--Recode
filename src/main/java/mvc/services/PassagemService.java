package mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.model.Passagem;
import mvc.repository.PassagemRepository;

@Service
public class PassagemService {

    private final PassagemRepository passagemRepository;

    @Autowired
    public PassagemService(PassagemRepository passagemRepository) {
        this.passagemRepository = passagemRepository;
    }

    // Operação de Criação (Create)
    public Passagem cadastrarPassagem(Passagem passagem) {
        return passagemRepository.save(passagem);
    }

    // Operação de Leitura (Read)
    public List<Passagem> listarTodasPassagens() {
        return passagemRepository.findAll();
    }

    // Operação de Busca por id_passagem
    public Optional<Passagem> buscarPorId(Long id) {
        return passagemRepository.findById(id);
    }

    // Operação de Atualização (Update) por id_passagem
    public Passagem atualizarPassagem(Passagem passagem) {
        return passagemRepository.save(passagem);
    }

    // Operação de Exclusão (Delete) por id_passagem
    public void excluirPassagem(Long id) {
        passagemRepository.deleteById(id);
    }

    // Operação de Busca por id_passagem
    public Optional<Passagem> buscarPorIdPassagem(Long id_passagem) {
        return passagemRepository.findById(id_passagem);
    }
}
