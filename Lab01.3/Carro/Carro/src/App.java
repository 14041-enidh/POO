public class App {
    public static void main(String[] args) throws Exception {
        Motor motor = new Motor(150, 1900);
        Carro carro1 = new Carro("Peugeot", 2009, motor);
        Carro carro2 = new Carro("Mazda", 2010, motor);

        System.out.println("Total de carros: " + Carro.getTotalCarrosCriados());
        System.out.println("Marca do 1º carro: " + carro1.getMarca());
        System.out.println("Marca do 2º carro: " + carro2.getMarca());
    }
}
