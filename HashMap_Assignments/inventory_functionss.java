package	HashMap_Assignments;
import java.util.HashMap;

import java.util.Map.Entry;


public class inventory_functionss {
	static int total;

	 static public void display(HashMap<Integer,inventory> map) {
		 
		
		for(Entry<Integer,inventory> i : map.entrySet()) {
			inventory p11=i.getValue();
			System.out.println(i.getKey() + p11.product_id + "   |" + "  Product Name " + "  |" + p11.product_name + " | " + "Price "+ p11.price + " | " + " Quantity : " + p11.quantity);
					
		}	
	}
	 
	 public static void bill(HashMap<Integer,inventory> bill) {
		 	int pretotal;
		 	total=0;
		 for(Entry<Integer,inventory> i : bill.entrySet()) {
				inventory p11=i.getValue();
				pretotal=p11.quantity * p11.price;
				total+=pretotal;
				System.out.println(i.getKey() + p11.product_id + "   |" + "  Product Name " + "  |" + p11.product_name + " | " + "Price "+ p11.price + " | " + " Quantity : " + p11.quantity);
				
			}
		 System.out.println("\n\n===================== Total Bill IS=========================\n"+total);
	 }
	 
}


