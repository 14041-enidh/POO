public class Motor {
    private int consumption;
    private boolean isTurnedOn;

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public boolean isIsTurnedOn() {
        return isTurnedOn;
    }

    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public Motor (int consumption){
        this.isTurnedOn = false;
        if (consumption <= 0){
            this.consumption = 1;
        } else{
            this.consumption = consumption;
        }
        
    }

    public void ligarMotor(){
        this.isTurnedOn = true;
    }

    public void desligarMotor(){
        this.isTurnedOn = false;
    }
}
