public class Funcionario {

    private String nome;
    private String apelido;
    private String numeroTelefone;
    private String email;
    private String contribuinte;
    private String cargo;

    public void registarServico(Reserva reserva, ServicoAdicional servico) {
        // TODO
    }

    public void registarCheckIn(Reserva reserva) {
        // TODO
    }

    public void registarCheckOut(Reserva reserva) {
        // TODO
    }

    // Getters e setters para consultar e alterar os atributos do funcionário.
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
