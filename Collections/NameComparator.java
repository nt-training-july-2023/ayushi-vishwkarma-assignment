package Collections;

import java.util.Comparator;

public class NameComparator implements Comparator<EmpComparator> {

	@Override
	public int compare(EmpComparator o1, EmpComparator o2) {
		// TODO Auto-generated method stub
		return o1.Name.compareTo(o2.Name);
	}

}
