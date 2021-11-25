public abstract class Animal implements IAnimal {

    private String nom;

    private String colour;

    private int weight;

    private int size;

    public Animal(String nom, String colour, int weight, int size) {
        this.nom = nom;
        this.colour = colour;
        this.weight = weight;
        this.size = size;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}