package garden;

public interface IPerson {
	
	boolean canPick();
	
	void pick(Flower flower, Garden garden);
}
