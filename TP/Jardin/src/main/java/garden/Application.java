package garden;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Flower pissenlit = new Flower("Pissenlit", "Jaune");
		Flower rose = new Flower("Rose", "Rouge");
		Flower tulipe = new Flower("Tulipe", "Orange");
		
		List<Flower> lesFleursDeBob = new ArrayList<Flower>(); // une liste de fleurs vide pour Bob
		
		Person roger = new Guest("Roger");
		Gardener bob = new Gardener("Bob", lesFleursDeBob);
		
		List<Flower> mesFleurs = new ArrayList<Flower>(); // la liste des fleurs du jardin
		
		/*int i = 0;
		while(i < 10000) {
			mesFleurs.add(pissenlit);
			i++;
		}*/
		
		
		mesFleurs.add(rose);
		
		Garden monJardin = new Garden(mesFleurs);
		
		System.out.println(monJardin);
		
		roger.pick(pissenlit, monJardin);
		bob.pick(pissenlit, monJardin);
		bob.pick(pissenlit, monJardin);
		bob.pick(tulipe, monJardin);
		
		System.out.println(monJardin);

		
		// arr[i]
		// list.get(pissenlit);
	}

}
