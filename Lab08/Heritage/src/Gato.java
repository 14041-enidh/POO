public class Gato extends Animal {
    int vidasRestantes;

    public Gato() {
        super();
    }

    public Gato(String name) {
        super(name);
    }

    public Gato(String name, int vidasRestantes) {
        super(name);
        this.vidasRestantes = vidasRestantes;
    }

    public void trepar(){
        System.out.println("A trepar...");
        System.out.println("Já trepei");
        this.descansar();
    }

    @Override
    public void emiteSom() {
        System.out.println("miau miau");
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }

    
}
