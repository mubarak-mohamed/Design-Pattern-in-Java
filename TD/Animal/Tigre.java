public class Tigre extends Animal {

    private boolean claws;

    public Tigre(String nom, String colour, int weight, int size, boolean claws) {
        super(nom, colour, weight, size);
        this.claws = claws;
    }

    public boolean hasClaws() {
        return claws;
    }

    public void setClaws(boolean claws) {
        this.claws = claws;
    }

    @Override
    public void swim() {
        System.out.println("je suis un tigre qui nage");
    }

    @Override
    public void eat() {
        System.out.println("je mange et c'est super bon");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZzzz");
    }

    @Override
    public void run() {
        System.out.println("je cours et c'est fatiguant");
    }
}