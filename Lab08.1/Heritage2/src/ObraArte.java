import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Representa uma obra de arte genérica.
 *
 * <p>A classe guarda a informação comum a todas as obras e calcula o valor
 * atual com base no preço de compra e numa valorização fornecida.</p>
 */
public class ObraArte {

    private String nome;
    private double precoCompra;
    private String genero;
    private LocalDate dataCompra = LocalDate.now();

    /** Cria uma obra com a data de compra igual à data atual. */
    public ObraArte() {
        this.dataCompra = LocalDate.now();
    }

    /**
     * Cria uma obra com todos os seus dados.
     *
     * @param nome nome da obra
     * @param precoCompra preço de compra da obra
     * @param genero género ou época da obra
     * @param dataCompra data em que a obra foi comprada
     */
    public ObraArte(String nome, int precoCompra, String genero, LocalDate dataCompra) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.genero = genero;
        this.dataCompra = dataCompra;
    }

    /**
     * Calcula há quantos meses a obra foi comprada.
     *
     * @return número de meses entre a data de compra e a data atual
     */
    public long obterMesesCompra() {
        LocalDate dataAtual = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(getDataCompra(), dataAtual);
        return meses;
    }

    /**
     * Devolve os dados da obra separados por vírgulas.
     *
     * @return representação textual da obra
     */
    @Override
    public String toString() {
        String valores = nome + "," + precoCompra + "," + genero + "," + dataCompra;
        return  valores;
    }

    /**
     * Calcula o valor atual da obra.
     *
     * @param valorizacao valorização a acrescentar ao preço de compra
     * @return preço de compra acrescido da valorização
     */
    public double getValorAtual(double valorizacao) {
        return precoCompra + valorizacao;
    }

    /** @return preço de compra da obra */
    public double getPrecoCompra() {
        return precoCompra;
    }

    /** @param precoCompra novo preço de compra */
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    /** @return género ou época da obra */
    public String getGenero() {
        return genero;
    }

    /** @param genero novo género ou época da obra */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /** @return data de compra da obra */
    public LocalDate getDataCompra() {
        return dataCompra;
    }

    /** @param dataCompra nova data de compra */
    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    /** @return nome da obra */
    public String getNome() {
        return nome;
    }

    /** @param nome novo nome da obra */
    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
