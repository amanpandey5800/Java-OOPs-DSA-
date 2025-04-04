package Collections;
import java.util.*;
public class array_list_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("berry");
		
		//fruits.add(121);
		
		String f=fruits.get(2);
		System.out.println(f);
		
		fruits.add(2,"kiwi");
		System.out.println(fruits);
		
		fruits.remove(4);
		System.out.println(fruits);
		
		for(String s : fruits) {
			System.out.println(s);
		}
	}

}
