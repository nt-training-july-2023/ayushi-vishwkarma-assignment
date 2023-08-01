package Collections;

import java.util.Comparator;

public class IdComparator implements Comparator<EmpComparator> {

	@Override
	public int compare(EmpComparator o1, EmpComparator o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

}
