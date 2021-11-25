package garden;

public class Guest extends Person {
	
	public Guest(String name) {
		super(name);
	}
	
	public boolean canPick() {
		return false;
	}
	
	public void pick(Flower flower, Garden garden) {
		System.out.println("Les visiteurs n'ont pas le droit de cueillir");
	}
}
