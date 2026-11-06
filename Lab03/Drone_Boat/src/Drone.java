public class Drone {
    private boolean isTurnedOn;
    private Battery battery;
    private Motor motor;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean isIsTurnedOn() {
        return isTurnedOn;
    }

    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Drone (){
        this.isTurnedOn = false;
        this.battery = new Battery(1000);
        this.motor = new Motor (100);
    }

    public Drone (int consumoMotor){
        this.isTurnedOn = false;
        this.battery = new Battery(1000);
        this.motor = new Motor(consumoMotor);
    }

    public void ligarDrone(){
        if(battery.getCargaAtual() >= 50){
            this.isTurnedOn = true;
            battery.usarBateria(10);
        }else{
            System.err.println("Não tem bateria suficiente");
        }
    }

    public void desligarDrone(){
        this.isTurnedOn = false;
    }

    public void ligarTomada (){
        if(this.isTurnedOn=false){
            battery.carregarTotalmente();
        }else{
            System.err.println("A bateria tem de estar desligada");
        }
    }

    public void substituirBateria(int capacidade){
        if(isTurnedOn=false && capacidade > 500){
            this.battery = new Battery(capacidade);
        }else if (this.isTurnedOn=true){
            System.err.println("Não tem bateria suficiente");
        }
    }

    public void fly(){
        if (isTurnedOn=true && battery.getCargaAtual() < motor.getConsumption() ){
            System.out.println("Drone em voo");
            battery.usarBateria(100);
        }else if (isTurnedOn=false){
            System.err.println("O drone está desligado");
        }else{
            System.err.println("A bateria não tem carga suficiente");
        }
    }

    public void land(){
        if (isTurnedOn=false){
            motor.desligarMotor();
            System.out.println("Drone aterrado");
        }
    }

}
