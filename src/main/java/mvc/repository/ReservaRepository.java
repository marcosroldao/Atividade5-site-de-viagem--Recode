package mvc.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;

import mvc.model.Reserva;

public interface ReservaRepository extends JpaRepository <Reserva, Long > {
	

}



