import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Meat meat = new Meat("boeuf");

        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle(10,"BMW");
        Vehicle vehicle2 = new Voiture(10,"peugeot");
        Vehicle vehicle3 = new Moto(10,"Hyundai");
        Vehicle vehicle4 = new Vehicle(10,"ZY");
        Vehicle vehicle5 = new Voiture(10,"peugeot");

        Sausage sausage = new Sausage(12.3f, 4.3f, meat);
        System.out.println(sausage);
        sausage.cook();
        System.out.println(sausage);

    }
}