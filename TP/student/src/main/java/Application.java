import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Student student = new Student("Martin", "Kelig");
        Student student1 = new Student("Kartin", "Melig");
        Student student2 = new Student("Lartin", "Selig");

        Aliment aliment1 = new Aliment("Salade");
        Aliment aliment2 = new Aliment("Tomate");
        Aliment aliment3 = new Aliment("Oignon");
        Aliment aliment4 = new Aliment("Pickle");
        Aliment aliment5 = new Aliment("Frites");
        Aliment aliment6 = new Aliment("Steak");
        List<Aliment> aliments = new ArrayList<>();
        List<Aliment> aliments2 = new ArrayList<>();
        aliments.add(aliment1);
        aliments.add(aliment2);
        aliments.add(aliment3);
        aliments.add(aliment5);
        aliments.add(aliment6);
        student.setAliments(aliments);
        student2.setAliments(aliments);

        aliments2.add(aliment4);
        student1.setAliments(aliments2);

        // array.push(e)
        // System.out.println(student.likesPickles());

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

    }
}