public class Moto extends Vehicle {

    public Moto(int puissance, String nom) {
        super(puissance, nom);
    }

    @Override
    public void klaxonner() {
        System.out.println("brrrrrrrrrrr");
    }

    @Override
    public void rouler() {
        System.out.println("je roule sur 2 roues");
    }
}