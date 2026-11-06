import java.time.LocalDate;

public class ServicoAdicional {

    private String tipo; // servico de quarto, lavandaria, transporte...
    private String descricao;
    private double preco;
    private LocalDate dataPedido;

    public double obterPreco() {
        // TODO
        return 0;
    }

    // Getters e setters para consultar e alterar os atributos do serviço adicional.
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
}
