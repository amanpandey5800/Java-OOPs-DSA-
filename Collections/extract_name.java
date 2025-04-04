package Collections;
import java.util.*;
public class extract_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hi aman, when are u going?");
		
		int p2=sb.indexOf(",");
		//int p1=sb.lastIndexOf(" ");
		
		String name=sb.substring(3,p2);
		System.out.println(name);
		
	}

}
