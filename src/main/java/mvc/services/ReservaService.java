package mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.model.Reserva;
import mvc.repository.ReservaRepository;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public Reserva cadastrarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> listarTodasReservas() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> buscarPorId(Long id) {
        return reservaRepository.findById(id);
    }

    public Reserva atualizarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void excluirReserva(Long id) {
        reservaRepository.deleteById(id);
    }

    public Optional<Reserva> buscarPorIdReserva(Long id_reserva) {
        return reservaRepository.findById(id_reserva);
    }
}