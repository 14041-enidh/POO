/** Representa uma obra de arte contemporânea. */
public class ObraContemporanea extends ObraArte {
    private int seculo;

    /**
     * Cria uma obra contemporânea para um século entre o 17 e o 21.
     *
     * @param valorSeculo século da obra
     */
    public ObraContemporanea(int valorSeculo) {
        if (valorSeculo >= 17 && valorSeculo <= 21) {
            this.seculo = valorSeculo;
        }else{
            System.err.println("Insira um seculo entre o 17 e o 21");
        }
    }

    /**
     * Calcula o valor atual, acrescentando 1% da valorização para obras do
     * século 17.
     *
     * @param valorizacao valorização média a aplicar
     * @return valor atual da obra
     */
    @Override
    public double getValorAtual(double valorizacao) {
        double valorAtual = super.getValorAtual(valorizacao);

        if (seculo == 17) {
            valorAtual += valorizacao * 0.01;
        }

        return valorAtual;
    }

    /** @return século da obra */
    public int getSeculo() {
        return seculo;
    }

    /** @param seculo novo século da obra */
    public void setSeculo(int seculo) {
        this.seculo = seculo;
    }

    /**
     * Devolve a representação textual da obra com a indicação de que é
     * contemporânea.
     *
     * @return representação textual da obra
     */
    @Override
    public String toString() {
        return "Obra Contemporânea: " + super.toString();
    }
    
}
