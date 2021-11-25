package garden;

public class Flower {
	
	private String name;
	
	private String colour;
	
	public Flower(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", colour=" + colour + "]";
	}
	
	
}
