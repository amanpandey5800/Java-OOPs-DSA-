package LinkedList;
import java.util.*;
public class linked_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> pl=new LinkedList<>();
		pl.add("red");
		pl.add("Yellow");
		pl.add("green");
		
		pl.add("Black");
		
		pl.add(1,"violet");
		System.out.println(pl);
		
		System.out.println("first :" + pl.getFirst());
		System.out.println("last : " + pl.getLast());
		
		pl.removeFirst();
		pl.removeLast();
		
	}

}
