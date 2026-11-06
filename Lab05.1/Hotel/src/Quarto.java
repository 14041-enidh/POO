public class Quarto {

    private int numero;
    private String categoria; // normal ou superior
    private double preco;
    private boolean ocupado;

    public boolean estaDisponivel() {
        // TODO
        return false;
    }

    public void ocupar() {
        // TODO
    }

    public void libertar() {
        // TODO
    }

    // Getters e setters para consultar e alterar os atributos do quarto.
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
