package Collections_comparator;
import java.util.*;
public class comparator_example {
	public static void main(String [] args) {
		ArrayList<studentt> std_list=new ArrayList<studentt>();
		std_list.add(new studentt("Priya",110,26));
		std_list.add(new studentt("Bob" ,105,28));
		std_list.add(new studentt("Rajesh" ,102,46));
		std_list.add(new studentt("supriya",120,236));
		
		for(studentt s: std_list) {
			System.out.println(s.id  + " "+ s.name+ " "+ s.age);
			
		}
		System.out.println("\n \n");
		
		Collections.sort(std_list,new namecomparator());
		for(studentt s : std_list) {
			System.out.println(s.id + " " + s.name + " " + s.age);
		}
		System.out.println("\n \n");
	}
}
