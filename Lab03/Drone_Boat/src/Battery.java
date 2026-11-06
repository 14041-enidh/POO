public class Battery {
    private int capacidade;
    private int cargaAtual;
    private int cargaUtilizada;

    public Battery(int capacidade){
        this.capacidade = capacidade;
        this.cargaAtual = 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if(capacidade>0){
            this.capacidade = capacidade;
        }else{
            this.capacidade = 1000;
        }
        
    }

    public int getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(int cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public int getBateriaUtilizada() {
        return cargaUtilizada;
    }

    public void setBateriaUtilizada(int bateriaUtilizada) {
        this.cargaUtilizada = bateriaUtilizada;
    }

    public void carregarTotalmente(){
        this.cargaAtual = capacidade;
        this.capacidade -= capacidade * 0.1;
    }

    public void descarregarTotalmente(){
        this.cargaAtual = 0;
    }

    public boolean usarBateria(int cargaUtilizada){
        if(cargaUtilizada>0 && cargaUtilizada<capacidade){
            this.cargaAtual -= cargaUtilizada;
            return true;
        } else if (cargaUtilizada<0){
            System.err.println("A carga utilizada deve ser maior que 0");
            return false;
        }else{
            System.err.println("A carga utilizada deve ser menor que a capacidade");
            return false;
        }
    
    }

    public int getPercentagemCarga() {
        if (capacidade <= 0 || cargaAtual <= 0) {
            return 0;
        }

        int percentagem = (int) cargaAtual / capacidade * 100;
        return percentagem;
    }

}
