package tri;

import java.util.Comparator;

import bean.Pays;

public  class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		int compareCountry;
		if(o1.getNbHabitant()> o2.getNbHabitant()) {
			compareCountry = -1;
		}else {
			compareCountry = 1;
		}
		return compareCountry;
	}

}
