import java.util.ArrayList;

/** Ponto de entrada da aplicação de exemplo. */
public class App {
    /**
     * Cria algumas obras, guarda-as numa lista e mostra os seus valores.
     *
     * @param args argumentos da linha de comandos
     */
    public static void main(String[] args) throws Exception {
        ObraClassica obra1 = new ObraClassica();
        obra1.setNome("Mona Lisa");
        obra1.setPrecoCompra(1000);
        obra1.setGenero("Pintura");

        ObraClassica obra2 = new ObraClassica();
        obra2.setNome("A Persistência da Memória");
        obra2.setPrecoCompra(1500);
        obra2.setGenero("Surrealismo");

        ObraContemporanea obra3 = new ObraContemporanea(20);
        obra3.setNome("Composição VIII");
        obra3.setPrecoCompra(2000);
        obra3.setGenero("Arte abstrata");

        ObraContemporanea obra4 = new ObraContemporanea(21);
        obra4.setNome("Balloon Dog");
        obra4.setPrecoCompra(3000);
        obra4.setGenero("Pop art");

        ArrayList<ObraArte> obras = new ArrayList<>();

        obras.add(obra1);
        obras.add(obra2);
        obras.add(obra3);
        obras.add(obra4);

        for (ObraArte obra : obras) {
            double valorizacaoMedia = obra.getPrecoCompra() * 0.15;
            double novoValor = obra.getValorAtual(valorizacaoMedia);

            System.out.println(obra.getNome() + ": " + novoValor);
        }
    }
}
