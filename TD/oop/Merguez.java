public class Merguez extends Sausage {

    private int spiciness;

    public Merguez(float length, float diameter, Meat meat, int spiciness) {
        super(length, diameter, meat);
        this.spiciness = spiciness;
    }

    public int getSpiciness() {
        return this.spiciness;
    }

    public void setSpiciness(int spiciness) {
        this.spiciness = spiciness;
    }

    public void cook() {
        // == this.length de saucisse
        // this.length = this.length - 0.2f
        this.setLength(this.getLength() - 0.2f); // remplace this.length par this.length
        this.setDiameter(this.getDiameter() - 0.2f);
    }

    @Override
    public String toString() {
        return "Merguez{" +
                "length=" + this.getLength() +
                ", diameter=" + this.getDiameter() +
                ", meat=" + this.getMeat() +
                ", spiciness=" + spiciness +
                '}';
    }
}