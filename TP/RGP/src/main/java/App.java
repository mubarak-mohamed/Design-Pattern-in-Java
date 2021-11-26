import combat.Combat;

public class App {

    public static void main(String[] args) {

        Combat mage  = new Combat("Mage");
        Combat chevalier = new Combat("Chevalier");
        Combat archer = new Combat("Archer");

        mage.attack(chevalier);
        System.out.println(chevalier.getHealth());
        mage.attack(chevalier);
        System.out.println(chevalier.getHealth());
        mage.attack(chevalier);
        System.out.println(chevalier.getHealth());




        System.out.println(mage.isDoped());
        mage.steroid();
        System.out.println(mage.isDoped());
        mage.attack(chevalier);
        System.out.println(chevalier.getHealth());

    }
}