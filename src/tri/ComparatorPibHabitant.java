package tri;

import java.util.Comparator;

import bean.Pays;

public class ComparatorPibHabitant  implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		int compareCountry;
		if(o1.getPIBParHab()> o2.getPIBParHab()) {
			compareCountry = -1;
		}else {
			compareCountry = 1;
		}
		return compareCountry;
	}

}
