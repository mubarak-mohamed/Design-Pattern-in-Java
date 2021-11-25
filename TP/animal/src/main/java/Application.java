public class Application {

    public static void main(String[] args) {

        Baleine baleine = new Baleine("Jupiter", "Bleu", 150000, 30, 4);
        System.out.println("Poids de ma baleine avant avoir mangé : " + baleine.getWeight());
        baleine.eat();
        System.out.println("Poids de ma baleine après avoir mangé : " + baleine.getWeight());
        baleine.swim();
        baleine.swim();
        baleine.swim();
        System.out.println("Poids de ma baleine après avoir nagé : " + baleine.getWeight());


        Tigre tigre = new Tigre("Roger", "Orange", 300, 2, true);
        tigre.eat();
        tigre.sleep();
        tigre.run();
        tigre.swim();
    }
}