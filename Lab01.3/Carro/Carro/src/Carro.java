public class Carro {
    private static int totalCarrosCriados;
    private String marca;
    private int ano;
    private Motor motor;

    public Carro (String marca, int ano, Motor motor) {
        this.marca = marca;
        this.ano = ano;
        this.motor = motor;
        totalCarrosCriados++;
    }

    public static int getTotalCarrosCriados() {
        return totalCarrosCriados;
    }

    public void setTotalCarrosCriados(int totalCarrosCriados) {
        Carro.totalCarrosCriados = totalCarrosCriados;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
