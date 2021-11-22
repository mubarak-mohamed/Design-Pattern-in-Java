public class Vehicle implements IVehicle {

    private int puissance;
    private String nom;

    public Vehicle(int puissance, String nom) {
        this.puissance = puissance;
        this.nom = nom;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void klaxonner(){

    }

    public void rouler() {

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "puissance=" + puissance +
                ", nom='" + nom + '\'' +
                '}';
    }
}