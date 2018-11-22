package bean;

public class Pays {
	
	private String nom;
	private long nbHabitant;
	private long PIBParHab;
	
	
	public Pays() {}
	
	public Pays(String nom, int nbHabitant, int pIBParHab) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		PIBParHab = pIBParHab;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	public long getPIBParHab() {
		return PIBParHab;
	}
	public void setPIBParHab(int pIBParHab) {
		PIBParHab = pIBParHab;
	}

	@Override
	public String toString() {
		return "Pays: " + nom + ", nombre Habitant = " + nbHabitant + ", PIB Par Habitant = " + PIBParHab + ", Pib total " + nbHabitant*PIBParHab;
	}
	
	
	
	
	
	
}
