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

import mvc.model.Reserva;
import mvc.services.ReservaService;

@Controller
 
public class ReservaController {

    private final ReservaService reservaService;
    
    
    @Autowired
    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }
    
    @GetMapping("/reserva.html")
    public String listarReserva(Model model) {
        List<Reserva> reserva = reservaService.listarTodasReservas();
        System.out.println("Reserva: " + reserva); // Adicione esta linha para depurar
        model.addAttribute("reserva", reserva);
        return "reserva.html"; // Nome da página HTML para listar cliente
    }
   
    
    @GetMapping("/excluirReserva/{id}")
    public String excluirReserva(@PathVariable Long id) {
        reservaService.excluirReserva(id);
        return "redirect:/reserva.html"; // Redireciona para a lista após excluir
    }
 
    

    @GetMapping("/create_reserva.html")
    public String createReservaForm() {
        return "create_reserva"; // Adjust the HTML page name
    }

    @PostMapping("/create_reserva")
    public String createReserva(@ModelAttribute Reserva reserva, Model model) {
        Reserva reservaCadastrada = reservaService.cadastrarReserva(reserva);
        model.addAttribute("reserva", reservaCadastrada);
        return "redirect:/reserva.html";
    }

    @GetMapping("/update_reserva/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Optional<Reserva> reserva = reservaService.buscarPorId(id);

        if (reserva.isPresent()) {
            model.addAttribute("reserva", reserva.get());
            return "update_reserva";
        } else {
            return "redirect:/reserva.html";
        }
    }

    @PostMapping("/update_reserva")
    public String updateReserva(@ModelAttribute Reserva reserva, Model model) {
        Reserva reservaAtualizada = reservaService.atualizarReserva(reserva);
        model.addAttribute("reserva", reservaAtualizada);
        return "redirect:/reserva.html";
    }
    
    
    @GetMapping(value = { "/update_reserva/index.html" })
    public String home() {
        return "redirect:/index.html";
    }
    
    
    @GetMapping(value = { "/update_reserva/Destino.html" })
    public String Destino() {
        return "redirect:/Destino.html";
    }
    
 
    
	@GetMapping(value = { "/update_reserva/Promoções.html" })
	public String Promoções() {
		return "Promoções.html";
	}
    
    
	  @GetMapping(value = { "/update_reserva/Contato.html" })
	    public String Contato() {
	        return "redirect:/Contato.html";
	    }
    
	  @GetMapping(value = { "/update_reserva/usuarios.html" })
	    public String usuarios() {
	        return "redirect:/usuarios.html";
	    }
  
	  
	  @GetMapping(value = { "/update_reserva/reserva.html" })
	    public String reserva() {
	        return "redirect:/reserva.html";
	    }

	  @GetMapping(value = { "/update_reserva/passagem.html" })
	    public String passagem() {
	        return "redirect:/passagem.html";
	    }

	  
	  
}



