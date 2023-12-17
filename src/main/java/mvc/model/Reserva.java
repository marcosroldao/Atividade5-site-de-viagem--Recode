package mvc.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


 



@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id_reserva;
	
	@Column(nullable = false)
	private String origem;
	
	@Column(nullable = false)
	private String destino;
	
	@Column 
	private LocalDate data_de_ida;
    
	@Column 
	private LocalDate data_de_volta;
    
	@Column
	private Long preco;

	public Long getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(Long id_reserva) {
		this.id_reserva = id_reserva;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getData_de_ida() {
		return data_de_ida;
	}

	public void setData_de_ida(LocalDate data_de_ida) {
		this.data_de_ida = data_de_ida;
	}

	public LocalDate getData_de_volta() {
		return data_de_volta;
	}

	public void setData_de_volta(LocalDate data_de_volta) {
		this.data_de_volta = data_de_volta;
	}

	public Long getPreco() {
		return preco;
	}

	public void setPreco(Long preco) {
		this.preco = preco;
	}


	
	 

}
