public class App {
    public static void main(String[] args) throws Exception {
        TravelCard cartao = new TravelCard();
        cartao.inicialize(15);
        cartao.beginTrip('F');
        cartao.endTrip();
    }
}
