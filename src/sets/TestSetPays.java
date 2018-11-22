package sets;

import java.util.HashSet;
import java.util.Set;

import bean.Pays;

public class TestSetPays {

	public static void main(String[] args) {
	
		Set <Pays> monSet = new HashSet<Pays>();
		
		monSet.add(new Pays("usa",324000000, 59531));
		monSet.add(new Pays("France",67120000, 38476));
		monSet.add(new Pays("Allemagne",82790000, 44469));
		monSet.add(new Pays("uk",66020000, 39720));
		monSet.add(new Pays("Italie",60590000, 31952));
		monSet.add(new Pays("Japon",126800000, 38428));
		monSet.add(new Pays("Chine",1386000000, 8826));
		monSet.add(new Pays("Russie",144000000, 10743));
		monSet.add(new Pays("Inde",1339000000, 1939));

		Pays maxPibHab = new Pays();
		long pibByHabImportant = Integer.MIN_VALUE;
		
		
		// Recherche du Pib par Hab le plus grand
		for (Pays pays : monSet) {
			if(pays.getPIBParHab()>pibByHabImportant) {
				pibByHabImportant = pays.getPIBParHab();
				maxPibHab = pays;
			}
		}
		
		System.out.println("Le pays avec le plus grand pib par habitant est " + maxPibHab.getNom() + " avec un pib par habitant de " + maxPibHab.getPIBParHab());
		
		
		
		// Recherche du Pib le plus grand
		Pays maxPib = new Pays();
		long PibImportant = Long.MIN_VALUE;
		for (Pays pays : monSet) {
			if((pays.getPIBParHab()*pays.getNbHabitant())>PibImportant) {
				PibImportant = pays.getPIBParHab()*pays.getNbHabitant();
				maxPib = pays;
			}
		}
		
		System.out.println("Le pays avec le plus grand pib est " + maxPib.getNom() + " avec un pib de " + PibImportant  + " "+ maxPib.getPIBParHab()*maxPib.getNbHabitant());
		
		
		
		// recherche du pays avec le plus petit pib
		Set <Pays> temp = new HashSet<Pays>();
		long pibPetit = Long.MAX_VALUE;
		Pays littlePibPays = new Pays();
		for (Pays pays : monSet) {
			if(pays.getNbHabitant()*pays.getPIBParHab()<pibPetit) {
				System.out.println(pays.getNom());
				pibPetit = pays.getNbHabitant()*pays.getPIBParHab();
				littlePibPays= pays;
			}
		}
		
		// ajout des majuscule pour le pays le plus petit et ajout dans le set temporaire
		for (Pays pays : monSet) {
			if(pibPetit == pays.getNbHabitant()*pays.getPIBParHab()) {
				littlePibPays.setNom(littlePibPays.getNom().toUpperCase());
				temp.add(littlePibPays);
			}else {
				temp.add(pays);
			}
		}
		// copie du tableau
		monSet.addAll(temp);
		
		
		// remise a neuf du tableau temp
		temp.clear();
		
		// parcours du tableau pour voir ce qui faut add et ne pas add le plus petit des pays
		for (Pays pays : monSet) {
			if(pibPetit == pays.getNbHabitant()*pays.getPIBParHab()) {
			// ne pas add
			}
			else { temp.add(pays);
				
			}
		}
		// on clear l'ancien tableau pour y mettre seulement ce qui sont dans le tab temporaire cad ceux qui ne sont pas le plus petit
		monSet.clear();
		monSet.addAll(temp);
		
		
		// Affichage des pays
		for (Pays pays : monSet) {
			System.out.println(pays.toString());
		}
	
		
	}
	
	

}
