public class Hospede {

    private String nome;
    private String apelido;
    private String numeroTelefone;
    private String email;
    private String contribuinte;
    private boolean temReserva;

    public void adquirirServico(ServicoAdicional servico) {
        // TODO
    }

    public void fazerReserva() {
        // TODO
    }

    // Getters e setters para consultar e alterar os atributos do hóspede.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public boolean isTemReserva() {
        return temReserva;
    }

    public void setTemReserva(boolean temReserva) {
        this.temReserva = temReserva;
    }
}
