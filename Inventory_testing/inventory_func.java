package Inventory_testing;

import java.util.HashMap;
import java.util.Map.Entry;

import Inventory_testing.inventoryy;

public class inventory_func {
	static int total;

	 static public void display(HashMap<Integer,inventoryy> map) {
		 
		
		for(Entry<Integer,inventoryy> i : map.entrySet()) {
			inventoryy p11=i.getValue();
			System.out.println(i.getKey() + p11.product_id + "   |" + "  Product Name " + "  |" + p11.product_name + " | " + "Price "+ p11.price + " | " + " Quantity : " + p11.quantity);
					
		}	
	}

	
	 public static HashMap<Integer,inventoryy> bill(HashMap<Integer,inventoryy> billmap) {
		 	int pretotal;
		 	total=0;
		 	for(Entry<Integer,inventoryy> i : billmap.entrySet()) {
				inventoryy p11=i.getValue();
				pretotal=p11.quantity * p11.price;
				total+=pretotal;
				System.out.println(i.getKey() + p11.product_id + "   |" + "  Product Name " + "  |" + p11.product_name + " | " + "Price "+ p11.price + " | " + " Quantity : " + p11.quantity);
				
				
		 		}
		 System.out.println("\n\n===================== Total Bill IS=========================\n");
		 return billmap;
	 }
}
