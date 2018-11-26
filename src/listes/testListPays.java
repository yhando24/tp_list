package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Ville;

public class testListPays {
	
	public static void main(String[] args) {
		
		List <Ville> maList  = new ArrayList<Ville>();
		
		maList.add(new Ville("Nice", 340000));
		maList.add(new Ville("Carcassonne", 47000));
		maList.add(new Ville("Narbonne", 53400));
		maList.add(new Ville("Lyon", 484000));
		maList.add(new Ville("Foix", 9700));
		maList.add(new Ville("Pau", 77200));
		maList.add(new Ville("Marseille", 850700));
		maList.add(new Ville("Tarbes", 40600));
		
		// recherche de la ville la plus peuplée
		Ville villePeuple = new Ville();
		villePeuple.setNbHabitant(Integer.MIN_VALUE);
		for (Ville ville : maList) {
			if(ville.getNbHabitant()>villePeuple.getNbHabitant()) {
				villePeuple.setNbHabitant(ville.getNbHabitant());
				villePeuple.setNom(ville.getNom());
			}
		}
		
		System.out.println("La ville la plus peuplée est " + villePeuple.getNom() + " avec " + villePeuple.getNbHabitant() + " hab.");
		
		// recherche de la plus petite ville
		int nbhab = Integer.MAX_VALUE;
		int index = 0;
		for (Ville ville : maList) {
				if(ville.getNbHabitant()<nbhab) {
					nbhab = ville.getNbHabitant();
					index = maList.indexOf(ville);
				}				
		}
		
		
		// suppresion de la plus petite ville
		maList.remove(index);
		
		
		// Mise en majusucle des noms des villes avec + de 100 000 hab
		for ( Ville ville : maList) {
			if(ville.getNbHabitant()>100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		//affichage des noms des villes restants
		for (Ville ville : maList) {
			System.out.print(ville.getNom()+ " ");
		}
		
		Iterator it = maList.iterator(); 

		
		
	}
	
	
}
