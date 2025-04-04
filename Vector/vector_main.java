package Vector;
import java.util.*;
public class vector_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vec = new Vector<String>();
		vec.add("Java");
		vec.add("database");
		vec.add("Git");
		
		System.out.println(vec);
		vec.remove("database");
		System.out.println("After removing : " + vec);
	}

}
