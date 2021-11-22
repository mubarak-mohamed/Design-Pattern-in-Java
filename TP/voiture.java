public class Voiture extends Vehicule {

    public Voiture(int puissance, String nom) {

        super(puissance, nom);
    }

    @Override
    public void klaxonner() {

        System.out.println("blabla blabla");
    }

}