public class App {
    
    public static void main(String[] args) throws Exception {
        Impressora impressora = new Impressora(100, TipoMarcaTinteiro.HP);
        String texto1 = "Fernando Puertas";
        String texto2 = "Certo Simões";
        impressora.imprimir(texto1);
        impressora.imprimir(texto2);
        impressora.imprimirPaginaTeste();

    }
}
