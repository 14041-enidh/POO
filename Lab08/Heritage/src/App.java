public class App {
    public static void main(String[] args) throws Exception {
        Cao cao = new Cao("Max", true);
        Gato gato = new Gato("Gacto", 9);

        Animal animal1 = cao;
        Animal animal2 = gato;

        animal1.emiteSom();
        animal2.emiteSom();

        cao.escavar();
        gato.trepar();
    }
}
