public class Motor {
    private int potencia;
    private int cilindrada;

    public Motor (int potencia, int cilindrada){
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
