/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fernando
 */
public class Impressora {
    private TipoMarcaTinteiro marcaDoTinteiro;
    private double mililitros;
    private int impressoesTinteiro;
    private int maximoImpressoes;
    private int tinteirosUtilizados = 1;
    private int totalImpressoes;

    public Impressora(int maximoImpressoes, TipoMarcaTinteiro marcaDoTinteiro) {
        this.mililitros = 5;
        this.maximoImpressoes = maximoImpressoes;
        this.marcaDoTinteiro = marcaDoTinteiro;
    }

    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }

    public int getImpressoesTinteiro() {
        return impressoesTinteiro;
    }

    public void setImpressoesTinteiro(int impressoesTinteiro) {
        this.impressoesTinteiro = impressoesTinteiro;
    }

    public int getMaximoImpressoes() {
        return maximoImpressoes;
    }

    public void setMaximoImpressoes(int maximoImpressoes) {
        this.maximoImpressoes = maximoImpressoes;
    }

    public int getTinteirosUtilizados() {
        return tinteirosUtilizados;
    }

    public void setTinteirosUtilizados(int tinteirosUtilizados) {
        this.tinteirosUtilizados = tinteirosUtilizados;
    }

        public int getTotalImpressoes() {
        return totalImpressoes;
    }

    public void setTotalImpressoes(int totalImpressoes) {
        this.totalImpressoes = totalImpressoes;
    }

    public void imprimir (String texto){
        if (impressoesTinteiro<maximoImpressoes && mililitros>=0.005){
            setImpressoesTinteiro(this.impressoesTinteiro += 1);
            setMililitros(this.mililitros -= 0.005);
            setTotalImpressoes(this.totalImpressoes +=1);
            System.out.println(texto);

        }else if (impressoesTinteiro>=maximoImpressoes){
            System.out.println("Erro, número máximo de impressões");
        }else if (mililitros<0.005){
            System.out.println("Erro, verifique o tinteiro");
        }
    }

    public void imprimirPaginaTeste() {
        String paginaTeste = " Página de teste \n"
                + "Marca do tinteiro: " + marcaDoTinteiro + "\n"
                + "Mililitros restantes: " + mililitros + "\n"
                + "Impressões do tinteiro atual: " + impressoesTinteiro + "\n"
                + "Máximo de impressões por tinteiro: " + maximoImpressoes + "\n"
                + "Tinteiros utilizados: " + tinteirosUtilizados + "\n"
                + "Total de impressões: " + totalImpressoes;
        imprimir(paginaTeste);
    }

    public void substituir(){
        setImpressoesTinteiro(this.impressoesTinteiro=0);
        setMililitros(this.mililitros=5);
        setTinteirosUtilizados(this.tinteirosUtilizados+=1);

        System.out.println("Tinteiro substituido");
    }

    public int impressoesDisponiveis (){
        int impressoesRestantes = maximoImpressoes - impressoesTinteiro;
        int impressoesPorTinta = (int) (mililitros / 0.005);
        return Math.min(impressoesRestantes, impressoesPorTinta);
    }

    public double mediaImpressoes() {
        if (tinteirosUtilizados == 0) {
            return 0;
        }
        return (double) totalImpressoes / tinteirosUtilizados;
    }

}
