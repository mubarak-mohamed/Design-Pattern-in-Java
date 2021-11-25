package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
	
	private List<Flower> flowerList = new ArrayList<Flower>();
	
	public Garden(List<Flower> flowerList) {
		this.flowerList = flowerList;
	}
	
	public List<Flower> getFlowerList() {
		return flowerList;
	}
	
	public void setFlowerList(List<Flower> flowerList) {
		this.flowerList = flowerList;
	}

	@Override
	public String toString() {
		return "Garden [flowerList=" + flowerList + "]";
	}
	
	
}
