package COLLECTIONSS;
import java.util.ArrayList;
import java.util.*;
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> std_list=new ArrayList<student>();
		std_list.add(new student("Aman" ,1,22));
		std_list.add(new student("Sahil",2,25));
		std_list.add(new student("Harshit" ,3,24));
		
		for(student i:std_list) {
			System.out.println( i.id + " "+i.name + " " + i.age);
		}
		System.out.println();
		
		Collections.sort(std_list);
		System.out.println("Sorted List  using comparables is \n ");
		
		for(student i : std_list) {
			System.out.println( i.id + " "+i.name + " " + i.age);
		}
		
	}

}
