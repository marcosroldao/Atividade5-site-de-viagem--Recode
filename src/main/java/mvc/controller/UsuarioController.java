package mvc.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import mvc.model.Usuarios;
import mvc.services.UsuarioService;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuarios.html")
    public String listarClientes(Model model) {
        List<Usuarios> cliente = usuarioService.listarTodosClientes();
        model.addAttribute("cliente", cliente);
        return "usuarios.html"; // Nome da página HTML para listar cliente
    }


    @GetMapping("/excluirUsuario/{id}")
    public String excluirUsuario(@PathVariable Long id) {
        usuarioService.excluirCliente(id);
        return "redirect:/usuarios.html"; // Redireciona para a lista após excluir
    }
    
    
    
	
	@GetMapping(value = { "/create_usuarios.html" })
	public String create_usuarios() {
		return "create_usuarios.html";
	}
	
    

    @PostMapping("/create-usuarios")
    public String createUsuarios(@ModelAttribute Usuarios usuario, Model model) {
        // Lógica para cadastrar o usuário
        Usuarios usuarioCadastrado = usuarioService.cadastrarCliente(usuario);
        model.addAttribute("usuario", usuarioCadastrado);

        // Redireciona para a lista de usuários após o cadastro
        return "redirect:/usuarios.html";
    }
	
	
 
    @GetMapping("/update_usuarios/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Optional<Usuarios> usuario = usuarioService.buscarPorId(id);
        
        if (usuario.isPresent()) {
            model.addAttribute("cliente", usuario.get()); // Use "cliente" as the attribute name
            return "update_usuarios";
        } else {
            return "redirect:/usuarios.html";
        }
    }

    // Add this method to handle the form submission for updating user information
    @PostMapping("/update_usuarios")
    public String updateUsuarios(@ModelAttribute("usuario") Usuarios usuario, Model model) {
        // Perform the update operation using the service
        Usuarios usuarioAtualizado = usuarioService.atualizarCliente(usuario);
        model.addAttribute("usuario", usuarioAtualizado);

        // Redirect to the user list page after the update
        return "redirect:/usuarios.html";
    }
    
    
    
 
	/*
	 * // Updated method with @GetMapping annotation
	 * 
	 * @GetMapping("/update_usuarios/{id}")
	 * 
	 * public String updateUsuario(@PathVariable Long id, Model model) { // Retrieve
	 * the user by ID from the service Optional<Usuarios> usuario =
	 * usuarioService.buscarPorId(id);
	 * 
	 * // Check if the user exists if (usuario.isPresent()) {
	 * model.addAttribute("usuario", usuario.get()); return "update_usuarios.html";
	 * // Provide the name of the HTML page for updating user information } else {
	 * // Handle the case where the user is not found return
	 * "redirect:/usuarios.html"; // Redirect to the user list page } }
	 * 
	 * // Add this method to handle the form submission for updating user
	 * information
	 * 
	 * @PostMapping("/update_usuarios") public String updateUsuarios(@ModelAttribute
	 * Usuarios usuario, Model model) { // Perform the update operation using the
	 * service Usuarios usuarioAtualizado =
	 * usuarioService.atualizarCliente(usuario); model.addAttribute("usuario",
	 * usuarioAtualizado);
	 * 
	 * // Redirect to the user list page after the update return
	 * "redirect:/usuarios.html"; }
	 */
}
    
    
    
    
    
  
    
    


