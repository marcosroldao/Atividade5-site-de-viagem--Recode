package mvc.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "passagem")

public class Passagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private Long id_passagem;
	
	@Column 
    private String destino;
	
	@Column 
    private String data_de_ida;
	
	@Column 
    private String data_de_volta;
	
	@Column 
    private String empresa;
	
	@Column 
    private String horario_da_ida;
	
	@Column 
    private String horario_da_volta;

	public Long getId_passagem() {
		return id_passagem;
	}

	public void setId_passagem(Long id_passagem) {
		this.id_passagem = id_passagem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getData_de_ida() {
		return data_de_ida;
	}

	public void setData_de_ida(String data_de_ida) {
		this.data_de_ida = data_de_ida;
	}

	public String getData_de_volta() {
		return data_de_volta;
	}

	public void setData_de_volta(String data_de_volta) {
		this.data_de_volta = data_de_volta;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getHorario_da_ida() {
		return horario_da_ida;
	}

	public void setHorario_da_ida(String horario_da_ida) {
		this.horario_da_ida = horario_da_ida;
	}

	public String getHorario_da_volta() {
		return horario_da_volta;
	}

	public void setHorario_da_volta(String horario_da_volta) {
		this.horario_da_volta = horario_da_volta;
	}

 
}
