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
		
		
		// transformation en majuscule
		for (String string : maList) {
			string = string.toUpperCase();
			System.out.println("ville : " + string);
		}
		
		
		System.out.println("La ville avec le nom le plus grand est " + villeGrand);
			
	
	
			
	}

}