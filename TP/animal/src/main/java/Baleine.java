public class Baleine extends Animal {

    private int nageoires;

    public Baleine(String nom, String colour, int weight, int size, int nageoires) {
        super(nom, colour, weight, size);
        this.nageoires = nageoires;
    }

    public int getNageoires() {
        return nageoires;
    }

    public void setNageoires(int nageoires) {
        this.nageoires = nageoires;
    }

    public void swim() {
        this.setWeight( this.getWeight() - 500 );
        System.out.println("Je nage super bien");
    }

    public void sleep() {
        this.setWeight( this.getWeight() - 100);
        System.out.println("ZZZzzz");
    }

    public void eat() {
        this.setWeight( this.getWeight() + 10000);
        System.out.println("Miam je mange");
    }

    public void run() {
        System.out.println("Je sais pas courir !");
    }
}