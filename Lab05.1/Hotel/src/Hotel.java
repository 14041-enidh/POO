import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Quarto> listaQuartos = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    public Reserva criarReserva(Hospede hospede, String categoria,
                                LocalDate dataCheckIn, LocalDate dataCheckOut) {
        // TODO
        return null;
    }

    public List<Quarto> listarQuartosDisponiveis() {
        // TODO
        return null;
    }

    // Getters e setters para consultar e alterar os atributos do hotel.
    public List<Quarto> getListaQuartos() {
        return listaQuartos;
    }

    public void setListaQuartos(List<Quarto> listaQuartos) {
        this.listaQuartos = listaQuartos;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
}
