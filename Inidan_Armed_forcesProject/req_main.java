package Inidan_Armed_forcesProject;
import java.util.*;
public class req_main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Set<String> locations = new HashSet<>();
		locations.add("delhi");
		locations.add("lakshadweep");
		locations.add("Mumbai");
		locations.add("Bangalore"); 
		locations.add("pondicherry");
		locations.add("chandigarh");
		locations.add("Goa");
		locations.add("j&k");
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter your Name = ");
		String n=sc.next();
		
		System.out.print("Enter your age = ");
		int ag=sc.nextInt();
		System.out.print("Enter your location =  ");
		String l=sc.next();
		String b=l.toLowerCase();
	
		
		System.out.print("Are you disabled  = ");
		String d=sc.next();
		String e=d.toLowerCase();
		
		if(ag<18 || ag>37 ||  locations.contains(b) || e.equals("yes") ) {
			System.out.println(n + " is not eligible ");
		}else {
			System.out.println(n + " is eligible");
		}
		
		
		
	}

}
