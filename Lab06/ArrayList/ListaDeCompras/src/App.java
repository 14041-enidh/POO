public class App {
    public static void main(String[] args) {
        ShoppingList lista = new ShoppingList();

        lista.addProduct("Leite");
        lista.addProduct("Pao");
        lista.addProduct("Leite");

        lista.incrementar(1);
        lista.decrementar(1);
        lista.alterarEstado("Leite");

        System.out.println("Lista original:");
        lista.show();

        Product[] products = lista.exportProducts();
        ShoppingList listaImportada = new ShoppingList();
        listaImportada.importProducts(products);

        System.out.println("Lista importada:");
        listaImportada.show();

        lista.remover("Pao");
        System.out.println("Lista depois de remover Pao:");
        lista.show();
    }
}
