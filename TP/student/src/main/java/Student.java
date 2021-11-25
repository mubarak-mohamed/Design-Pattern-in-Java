import java.util.ArrayList;
import java.util.List;

public class Student implements Gourmand {

    String name;
    String firstName;
    List<Aliment> aliments = new ArrayList<>();

    public Student(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Aliment> getAliments() {
        return aliments;
    }

    public void setAliments(List<Aliment> aliments) {
        this.aliments = aliments;
    }

    public boolean likesPickles() {
        for(Aliment a : aliments) {
            if(a.getName().equals("Pickle")) {
                return true;
            }
        }
        return false;
    }

}