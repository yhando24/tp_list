package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		
		Set <String> monSet = new HashSet<String>();
		String [] tab = { "USA", "France", "Allemagne", "UK", "Italie", "Japon", " Chine", "Russie", "Inde"};
		Collections.addAll(monSet, tab);
		
		// Affichage du tableau
		System.out.println(" - Affichage du tableau :");
		for (String string : monSet) {
			System.out.print(string + " ");
		}
		
		
		// recherche de l'element le plus long
		int letter = Integer.MIN_VALUE;
		String toDelete = "";
		for (String string : monSet) {
			if(string.length()>letter) {
				letter = string.length();
				toDelete = string;
			}
		}
		// suppresion de l'element le plus long
		monSet.remove(toDelete);
		System.out.print("\r\n\r\n  - Affichage du tableau sans l'element le plus long : \r\n");
		for (String string : monSet) {
			System.out.print(string + " ");
		}
		
		// Creation du set temp
		Set<String> temp = new HashSet<String>();
		
		// parcours du  1er tab et ajout dans le tab temporaire  
		for(String string : monSet) {
		   temp.add(string.toUpperCase());
		}
		
		// on clear l'ancien et on met le temp dans l'ancien
		monSet.clear();
		monSet.addAll(temp);
		System.out.print("\r\n\r\n - Affichage du tableau avec pays en majuscule : \r\n");
		for (String string : monSet) {
		
			System.out.print(string + " ");
		}
		
		
	}

}
