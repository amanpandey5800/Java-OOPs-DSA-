package Collections_comparator;

import java.util.Comparator;

public class Rollnocomparator implements Comparator<studentt> {
	
	public int compare(studentt s1, studentt s2) {
		return s1.id - s2.id;  // ascending order
	}

}
