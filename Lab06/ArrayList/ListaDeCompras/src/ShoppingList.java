import java.util.ArrayList;

public class ShoppingList {
    ArrayList <Product> nomeProduto;

    public ShoppingList() {
        nomeProduto = new ArrayList<>();
    }

    void addProduct(String productName) {
        for (Product produto : nomeProduto) {
            if (produto.getProduto().equals(productName)) {
                produto.incrementar();
                return;
            }
        }

        Product produto = new Product();
        produto.setProduto(productName);
        produto.setQuantidade(1);
        produto.setEstaVerificado(false);
        nomeProduto.add(produto);
    }

    public ArrayList<Product> getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(ArrayList<Product> nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    String getInformation() {
        String info = "Lista de compras:\n";
        for (Product produto : nomeProduto) {
            info += produto.getInformation() + "\n";
        }
        return info;
    }

    public void show(){
        System.out.println(getInformation());
    }

    public void removerProduto(int indice) {
        if (indice >= 0 && indice < nomeProduto.size()) {
            nomeProduto.remove(indice);
        }
    }

    public void alterarEstado(int indice) {
        if (indice >= 0 && indice < nomeProduto.size()) {
            nomeProduto.get(indice).alterarEstado();
        }
    }

    public void incrementar(int indice) {
        if (indice >= 0 && indice < nomeProduto.size()) {
            nomeProduto.get(indice).incrementar();
        }
    }

    public void decrementar(int indice) {
        if (indice >= 0 && indice < nomeProduto.size()) {
            nomeProduto.get(indice).decrementar();
        }
    }

    public void removerVerificados() {
        for (int i = 0; i < nomeProduto.size(); i++) {
            if(nomeProduto.get(i).isEstaVerificado()){
                nomeProduto.remove(i);
            }
        }
        
    }

    public int posicao(String nome) {
        for (int i = 0; i < nomeProduto.size(); i++) {
            if (nomeProduto.get(i).getProduto().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remover(String nome) {
        int indice = posicao(nome);
        if (indice != -1) {
            nomeProduto.remove(indice);
            return true;
        }else{
            return false;
        }
    }

    public boolean alterarEstado(String nome) {
        int indice = posicao(nome);
        if (indice != -1) {
            nomeProduto.get(indice).alterarEstado();
            return true;
        }else{
            return false;
        }
    }

    public void importProducts(Product[] products){
        if (products != null){
            for (Product product : products) {
                addProduct(product.getProduto());
            }
        }
    }

    public Product[] exportProducts() {
        Product[] products = new Product[nomeProduto.size()];

        for (int i = 0; i < nomeProduto.size(); i++) {
            products[i] = nomeProduto.get(i);
        }

        return products;
    }
}
