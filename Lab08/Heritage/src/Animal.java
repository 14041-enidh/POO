public abstract class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void descansar(){
        System.out.println("A descansar...");
    }

    public abstract void emiteSom();
}
