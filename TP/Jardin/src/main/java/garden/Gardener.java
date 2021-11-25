package garden;

import java.util.ArrayList;
import java.util.List;

public class Gardener extends Person {
	
	private List<Flower> flowerList = new ArrayList<Flower>();
	
	public Gardener(String name, List<Flower> flowerList) {
		super(name);
		this.flowerList = flowerList;
	}
	
	public List<Flower> getFlowerList() {
		return flowerList;
	}
	
	public void setFlowerList(List<Flower> flowerList) {
		this.flowerList = flowerList;
	}
	
	public boolean canPick() {
		return true;
	}
	
	public void pick(Flower flower, Garden garden) {
		// est-ce que flower est dans garden ?
		// si oui on l'ajoute a ma liste et on l'enlève du jardin
		// sinon message d'erreur
		
		if (garden.getFlowerList().contains(flower)) {
			// oui --> true , non -> false
			System.out.println(this.getName() + " ramasse " + flower.getName());
			garden.getFlowerList().remove(flower);
			flowerList.add(flower);
		}
		else {
			System.out.println("Cette fleur n'est pas dans ce jardin");
		}
		
	}
}
