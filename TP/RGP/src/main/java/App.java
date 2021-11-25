import combat.Combat;

public class App {

    public static void main(String[] args) {

        Combat zizou = new Combat("Zizou");
        Combat matera = new Combat("Matera");

        zizou.attack(matera);
        System.out.println(matera.getHealth());
        zizou.attack(matera);
        System.out.println(matera.getHealth());
        zizou.attack(matera);
        System.out.println(matera.getHealth());

        System.out.println(zizou.isDoped());
        zizou.steroid();
        System.out.println(zizou.isDoped());
        zizou.attack(matera);
        System.out.println(matera.getHealth());
    }
}