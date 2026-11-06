public class Cao extends Animal{
    boolean isCaudaCurta;

    public Cao() {
        super();
    }

    public Cao(String name) {
        super(name);
    }

    public Cao(String name, boolean isCaudaCurta) {
        super(name);
        this.isCaudaCurta = isCaudaCurta;
    }

    public void escavar(){
        System.out.println("A escavar...");
        System.out.println("Já escavei");
        this.descansar();
    }

    @Override
    public void emiteSom() {
        System.out.println("ão ão");
    }

    public boolean isIsCaudaCurta() {
        return isCaudaCurta;
    }

    public void setIsCaudaCurta(boolean isCaudaCurta) {
        this.isCaudaCurta = isCaudaCurta;
    }
    
}
