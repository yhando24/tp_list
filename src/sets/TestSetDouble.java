package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		
		
		Set <Double > monSet = new HashSet<Double>();
		monSet.add(1.5);
		monSet.add(8.25);
		monSet.add(-7.32);
		monSet.add(13.3);
		monSet.add(-12.45);	
		monSet.add(48.5);
		monSet.add(0.01);
		
		
		// Affichage des elements de la collection
		
		for (Double double1 : monSet) {
			System.out.print(double1 + " ");
		}
		
		// Recherche du plus grand
		
		Double max = Collections.max(monSet);
		System.out.println("\n\rle plus grand est " +max);
		
		
		// Recherche du plus petit
		Double index =0.0;
		for (Double double1 : monSet) {
			if(double1 == Collections.min(monSet)) {
				index = double1;
			}
		}
		
		// suppresion du plus petit
		monSet.remove(index);
		

		// recherche des elements negatif et changement en positif
		Set <Double > monSetTemp = new HashSet<Double>();
		for (Double double1 : monSet) {
			 if(double1 < 0) {
				 monSetTemp.add(Math.abs(double1));
			 }else {
				 monSetTemp.add(double1);
			 }
		}
		monSet=monSetTemp;
		
		// Affichage du set modifié
		for (Double double1 : monSet) {
			System.out.print(double1 + " ");
		}
		
		
	}
}
