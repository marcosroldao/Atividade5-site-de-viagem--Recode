package mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.model.Usuarios;
import mvc.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Operação de Criação (Create)
    public Usuarios cadastrarCliente(Usuarios cliente) {
        return usuarioRepository.save(cliente);
    }

    // Operação de Leitura (Read)
    public List<Usuarios> listarTodosClientes() {
        return usuarioRepository.findAll();
    }

    // Operação de Busca por id_cliente
    public Optional<Usuarios> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // Operação de Atualização (Update) por id_cliente
    public Usuarios atualizarCliente(Usuarios cliente) {
        return usuarioRepository.save(cliente);
    }

    // Operação de Exclusão (Delete) por id_cliente
    public void excluirCliente(Long id) {
        usuarioRepository.deleteById(id);
    }

    // Operação de Busca por id_cliente
    public Optional<Usuarios> buscarPorIdCliente(Long id_cliente) {
        return usuarioRepository.findById(id_cliente);
    }
    
}
