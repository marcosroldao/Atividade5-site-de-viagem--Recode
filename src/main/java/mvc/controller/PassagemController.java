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

import mvc.model.Passagem;
import mvc.model.Reserva;
import mvc.services.PassagemService;

@Controller
public class PassagemController {

    private final PassagemService passagemService;

    @Autowired
    public PassagemController(PassagemService passagemService) {
        this.passagemService = passagemService;
    }

    @GetMapping("/passagem.html")
    public String listarPassagem(Model model) {
        List<Passagem> passagem = passagemService.listarTodasPassagens();
        System.out.println("Passagem: " + passagem); // Adicione esta linha para depurar
        model.addAttribute("passagem", passagem);
        return "passagem.html"; // Nome da página HTML para listar passagem
    }
    
    @GetMapping("/excluirPassagem/{id}")
    public String excluirPassagem(@PathVariable Long id) {
        passagemService.excluirPassagem(id);
        return "redirect:/passagem.html"; // Redireciona para a lista após excluir
    }

    
    @GetMapping("/create_passagem.html")
    public String createPassagemForm() {
        return "create_passagem"; // Adjust the HTML page name
    }  
    
    
    @PostMapping("/create_passagem")
    public String createPassagem(@ModelAttribute Passagem passagem, Model model) {
        Passagem passagemCadastrada = passagemService.cadastrarPassagem(passagem);
        model.addAttribute("passagem", passagemCadastrada);
        return "redirect:/passagem.html";
    }
    
    
    @GetMapping("/update_passagem/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Optional<Passagem> passagem = passagemService.buscarPorId(id);

        if (passagem.isPresent()) {
            model.addAttribute("passagem", passagem.get());
            return "update_passagem";
        } else {
            return "redirect:/passagem.html";
        }
        
        
        
    }
    
    
    @PostMapping("/update_passagem")
    public String updatePassagem(@ModelAttribute Passagem passagem, Model model) {
        Passagem passagemAtualizada = passagemService.atualizarPassagem(passagem);
        model.addAttribute("passagem", passagemAtualizada);
        return "redirect:/passagem.html";
    }
    
}
