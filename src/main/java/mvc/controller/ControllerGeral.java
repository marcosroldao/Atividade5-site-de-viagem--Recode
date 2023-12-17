package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ControllerGeral {

	
	
	@GetMapping(value = { "/", "/index.html" })
	public String home() {
		return "index.html";
	}
	
 
	
	@GetMapping(value = { "/Destino.html" })
	public String destino() {
		return "Destino.html";
	}
	
	@GetMapping(value = { "/salvador.html" })
	public String Salvador() {
		return "salvador.html";
	}
	
	
	@GetMapping(value = { "/puntacana.html" })
	public String Puntacana() {
		return "/puntacana.html";
	}
	
	@GetMapping(value = { "/foz.html" })
	public String Foz() {
		return "/foz.html";
	}
	
	
	@GetMapping(value = { "/floripa.html" })
	public String Floripa() {
		return "/floripa.html";
	}
	
	@GetMapping(value = { "/buzios.html" })
	public String Buzios() {
		return "/buzios.html";
	}
	
	
	@GetMapping(value = { "/bariloche.html" })
	public String Bariloche() {
		return "/bariloche.html";
	}
	
	
	@GetMapping(value = { "/Promoções.html" })
	public String Promoções() {
		return "Promoções.html";
	}
	
	@GetMapping(value = { "/Contato.html" })
	public String Contato() {
		return "Contato.html";
	}
	
	
	@GetMapping(value = { "/comprar.html" })
	public String Comprar() {
		return "Comprar.html";
	}

 
	/*
	 * @GetMapping(value = { "/create_usuarios.html" }) public String
	 * create_usuarios() { return "create_usuarios.html"; }
	 */
	
	
	
}
	
	
	




 

 
