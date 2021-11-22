public class Voiture extends Vehicle {

    public Voiture(int puissance, String nom) {
        super(puissance, nom);
    }

    @Override
    public void klaxonner() {
        System.out.println("tut tut");
    }

    @Override
    public void rouler() {
        System.out.println("je suis une voiture qui roule");
    }
}
