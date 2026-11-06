public class Product {
    String produto;
    int quantidade;
    boolean estaVerificado;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isEstaVerificado() {
        return estaVerificado;
    }

    public void setEstaVerificado(boolean estaVerificado) {
        this.estaVerificado = estaVerificado;
    }

    void incrementar(){
        this.quantidade+=1;
    }

    void decrementar(){
        if (quantidade>1){
            this.quantidade -= 1;
        }else{
            System.err.println("A quantidade deve ser maior que um");
        }
        
    }

    void alterarEstado(){
        this.estaVerificado = !estaVerificado;
    }
    
    String getInformation(){
        return produto + ", " + quantidade + (estaVerificado ? " (X)" : "");
    }
    
}
