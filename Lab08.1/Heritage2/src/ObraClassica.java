/** Representa uma obra de arte clássica. */
public class ObraClassica extends ObraArte {
    /**
     * Calcula o valor atual, acrescentando 5% da valorização para obras da
     * época {@code CLASSICO ROMANO}.
     *
     * @param valorizacao valorização média a aplicar
     * @return valor atual da obra
     */
    @Override
    public double getValorAtual(double valorizacao) {
        double valorAtual = super.getValorAtual(valorizacao);

        if ("CLASSICO ROMANO".equals(getGenero())) {
            valorAtual += valorizacao * 0.05;
        }

        return valorAtual;
    }

    /**
     * Devolve a representação textual da obra com a indicação de que é
     * clássica.
     *
     * @return representação textual da obra
     */
    @Override
    public String toString() {
        return "Obra Clássica: " + super.toString();
    }
}
