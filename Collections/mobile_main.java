package Collections;
import java.util.*;
public class mobile_main {
	static ArrayList<mobile_details> mob;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mob=new ArrayList<mobile_details>();
		mobile_details p1=new mobile_details("Samsung","Galaxy",10000,8);
		mobile_details p2=new mobile_details("Apple","iphone",40000,8);
		mobile_details p3=new mobile_details("Sony","xperia",50000,8);
		mobile_details p4=new mobile_details("Samsung","Galaxy",60000,8);
		mobile_details p5=new mobile_details("Vivo","Vivo",20000,2);
		mobile_details p6=new mobile_details("Samsung","Galaxy",30000,4);
		mobile_details p7=new mobile_details("Google","Pixel",50000,8);
		mobile_details p8=new mobile_details("oneplus","Nord",60000,7);
		mobile_details p9=new mobile_details("Samsung","Galaxy",70000,9);
		mobile_details p10=new mobile_details("Apple","Iphone",60000,8);
			
		mob.add(p1);
		mob.add(p2);
		mob.add(p3);
		mob.add(p4);
		mob.add(p5);
		mob.add(p6);
		mob.add(p7);
		mob.add(p8);
		mob.add(p9);
		mob.add(p10);
		
		for(mobile_details i : mob) {
//			i.display();
			i.search();	
		}
		mobile_operations.display(mob);
		
		System.out.println("=======================================================================");
		mobile_operations.ramm(mob);
		
//		for(mobile_details z : mob) {
////		
//			z.pricerange();
//		}
//		for(mobile_details y:mob) {
//			y.ramm();
//		}
}

}
