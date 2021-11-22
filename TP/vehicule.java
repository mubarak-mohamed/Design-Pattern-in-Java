public class Vehicule {

    private int puissance;
    private String nom;

    public Vehicule(int puissance, String nom) {
        this.puissance = puissance;
        this.nom = nom;
    }
    public int getPuissance() {
        return this.puissance;
    }

    public void klaxonner() {
        System.out.println("tut tue tute");
    }

}