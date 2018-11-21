package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
	
	public static void main(String[] args) {
		
		// Exercice 1 :
		
		List maList = new ArrayList<>();
		
		maList.add(-1);
		maList.add(5);
		maList.add(7);
		maList.add(3);
		maList.add(-2);
		maList.add(4);
		maList.add(8);
		maList.add(5);
		
		for (Object object : maList) {
			System.out.print("mes elements : " + object+" ");
		}
		int max = (int) Collections.max(maList);
		System.out.println("");
		System.out.println("le plus grand chiffre est de " + max);
		int min =  (int) Collections.min(maList);
	
		maList.remove(	maList.indexOf(min));
		
	
		for ( Object object : maList) {
			int i = (int) object;	
			if( i<0) {
				object = (int) Math.abs(i);
			}
		}
		System.out.println("");
		for (Object object : maList) {
			System.out.print("mes elements : " + object+" ");
		}
		

		
		
		
		
		
	}



}
