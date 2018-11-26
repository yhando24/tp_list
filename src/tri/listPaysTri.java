package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import bean.Pays;
import bean.Ville;

public class listPaysTri {

	public static void main(String[] args) {
	
		List <Pays> maList  = new ArrayList<Pays>();

		
		maList.add(new Pays("USA",324000000, 59531));
 		maList.add(new Pays("ALLEMAGNE",82790000, 44469));
		maList.add(new Pays("UK",66020000, 39720));
		maList.add(new Pays("Italie",60590000, 31952));
		maList.add(new Pays("JAPON",126800000, 38428));
		maList.add(new Pays("CHINE",1386000000, 8826));
		maList.add(new Pays("RUSSIE",144000000, 10743));
		maList.add(new Pays("INDE",1339000000, 1939));
		
		
		
		System.out.println("Affichage de la liste non trié");
		System.out.println(maList + "\r\n");
		
		// tri par ordre selon la methode dans le compareTo 
		Collections.sort(maList);
		
		System.out.println("Affichage de la liste  trié selon la methode compareTo");
		System.out.println(maList  + "\r\n");
		
		System.out.println("Affichage de la liste  trié selon la methode comparator habitant");
		ComparatorHabitant trihabitant = new ComparatorHabitant();
		Collections.sort(maList, trihabitant);
		System.out.println(maList  + "\r\n");
		
		
		
		System.out.println("Affichage de la liste  trié selon la methode comparator pibHabitant ");
		ComparatorPibHabitant triPibhabitant = new ComparatorPibHabitant();
		Collections.sort(maList, triPibhabitant);
		System.out.println(maList  + "\r\n");
		
	}
}
