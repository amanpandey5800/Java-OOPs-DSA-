package Collections_comparator;
import java.util.*;


public class namecomparator implements Comparator<studentt> {
	public int compare(studentt s1,studentt s2) {
		return s1.name.compareTo(s2.name);
	}
}
