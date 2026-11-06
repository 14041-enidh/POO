public class RemoteControlledBoat {
    private char route;
    private boolean isTurnedOn;
    Battery battery;
    Motor motor;

    public RemoteControlledBoat (){
        this.isTurnedOn = false;
        this.battery = new Battery(1500);
        this.motor = new Motor(150);
        this.route = 0;
    }

    public char getRoute() {
        return route;
    }
    public void setRoute(char route) {
        this.route = route;
    }
    
    public boolean isTurnedOn() {
        return isTurnedOn;
    }
    public void setTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }
    
    public Battery getBattery() {
        return battery;
    }
    public void setBattery(Battery battery) {
        this.battery = battery;
    }
    
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void ligarBarco(){
        if(battery.getCargaAtual() >= 75){
            this.isTurnedOn = true;
            battery.usarBateria(15);
        }else{
            System.err.println("Não tem bateria suficiente");
        }
    }

    public void desligarDrone(){
        this.isTurnedOn = false;
        this.route = 0;
    }

    public void substituirBateria(int capacidade){
        if(!this.isTurnedOn && capacidade > 750){
            this.battery = new Battery(capacidade);
        } else if (this.isTurnedOn) {
            System.err.println("Não é possível trocar a bateria com o barco ligado");
        }
    }
    
    public void navigateForward(char route){
        if (battery.getCargaAtual() >= motor.getConsumption()
                && (route == 'N' || route == 'S' || route == 'E' || route == 'W')
                && isTurnedOn) {

            motor.ligarMotor();
            this.route = route;
            battery.usarBateria(100);
            
            System.out.println("Barco a navegar à vante – Rota: Norte -" + "Percentagem restante de carga" + battery.getCargaAtual());

        }
    }

    public void navigateBackwards(char route){
        if (battery.getCargaAtual() >= motor.getConsumption()
                && (route == 'N' || route == 'S' || route == 'E' || route == 'W')
                && isTurnedOn) {
            
            motor.desligarMotor();
            motor.ligarMotor();
            this.route = route;
            battery.usarBateria(100);

            System.out.println("Barco a navegar à ré – Rota: Sul -" + "Percentagem restante de carga" + battery.getCargaAtual());

        }
    }

}
