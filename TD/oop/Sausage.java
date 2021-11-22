public class Sausage {

    private float length;
    private float diameter;
    private Meat meat;

    public void cook() {
        this.length = this.length - 0.1f;
        this.diameter = this.diameter - 0.1f;
    }

    public Sausage(float length, float diameter, Meat meat) {
        this.length = length;
        this.diameter = diameter;
        this.meat = meat;
    }


    public Sausage(float length, float diameter) {
        this.length = length;
        this.diameter = diameter;
    }


    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getDiameter() {
        return this.diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Meat getMeat() {
        return this.meat;
    }

    @Override
    public String toString() {
        return "Sausage{" +
                "length=" + length +
                ", diameter=" + diameter +
                ", meat=" + meat +
                '}';
    }
}