package maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import bean.Pays;

public class TestMapPays {

	public static void main(String[] args) {

		
	     Map<String, Pays> myMap = new HashMap<>();
	     
	     Set <Pays> monSet = new HashSet<Pays>();
		
		monSet.add(new Pays("USA",324000000, 59531));
		monSet.add(new Pays("FRANCE",67120000, 38476));
		monSet.add(new Pays("ALLEMAGNE",82790000, 44469));
		monSet.add(new Pays("UK",66020000, 39720));
		monSet.add(new Pays("Italie",60590000, 31952));
		monSet.add(new Pays("JAPON",126800000, 38428));
		monSet.add(new Pays("CHINE",1386000000, 8826));
		monSet.add(new Pays("RUSSIE",144000000, 10743));
		monSet.add(new Pays("INDE",1339000000, 1939));
	     
	     
	     
	     for (Pays pays : monSet) {
			myMap.put(pays.getNom(), pays);
		}

	     Scanner sc = new Scanner(System.in);
	     
	     methodes.afficheMenu();
	     int choix = sc.nextInt();
	     String key = "";
	     	switch (choix) {
			case 1:
					sc.nextLine();
				
					while(1==1) {
						System.out.println("pays a check ?");
						
						
						 key = sc.nextLine().toUpperCase();
						
						Pays p = myMap.get(key);
						
						if(p != null) {
							System.out.println(p.toString());
						}
						break;
					}
	
				
				break;
			
			case 2:
				sc.nextLine();
				
				while(1==1) {
					System.out.println("pays a supprimer ?");
					
					
					 key = sc.nextLine().toUpperCase();
					
					Pays p = myMap.get(key);
					
					if(p != null) {
						System.out.println(p.getNom() +" supprimé");
						myMap.remove(key);
						
					}
					break;
				}
				
				break;
				
			case 3:
			System.out.println(myMap);
				break;

			default:
				break;
			}
	     
	     
	}

}
