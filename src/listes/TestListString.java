package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListString {

	
	public static void main(String[] args) {
		
		
		List  <String> maList  = new ArrayList <String> ();
		String [] table = {"Nice", "Carcassone", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
		maList.addAll(Arrays.asList(table));
		
		// ville la plus grande
		int tailleMax = Integer.MIN_VALUE;
		String villeGrand = "";
		Iterator i = maList.iterator();
		while(i.hasNext()){
			String next = (String) i.next();
			if(next.length()>tailleMax) {
				tailleMax = next.length();
				villeGrand = next;
			}
		}
		System.out.println("La ville avec le nom le plus grand est " + villeGrand);
		
		// transformation en majuscule
		for (String string : maList) {
			maList.set(maList.indexOf(string), string.toUpperCase());
		}
		
		// suppresion des villes commencant par N
		for (int j =0; j<maList.size(); j++) {
			if(maList.get(j).charAt(0) == 'N') {
				maList.remove(maList.indexOf(maList.get(j)));
			}
		}
		
		// Affichage des villes restantes et modifié	
		for (String string : maList) {
			System.out.println(string);
		}
	
			
	}

}