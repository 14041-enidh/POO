import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private String categoria;
    private Quarto quarto;
    private Hospede hospede;
    private List<ServicoAdicional> listaServicos = new ArrayList<>();
    private String estado; // ativa, concluida
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

    public void fazerCheckIn() {
        // TODO
    }

    public void fazerCheckOut() {
        // TODO
    }

    public void adicionarServico(ServicoAdicional servico) {
        // TODO
    }

    public double calcularCustoTotal() {
        // TODO
        return 0;
    }

    // Getters e setters para consultar e alterar os atributos da reserva.
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public List<ServicoAdicional> getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(List<ServicoAdicional> listaServicos) {
        this.listaServicos = listaServicos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
}
