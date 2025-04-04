package Hashmap;
import java.util.*;
import java.util.Map.Entry;
public class inventory_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,inventory_map> map=new HashMap<Integer,inventory_map>();
		
		inventory_map p1=new inventory_map(101,"Phone", "Google",  35000,  10);
		inventory_map p2=new inventory_map(102,"Laptop","Dell",70000,20);
		inventory_map p3=new inventory_map(103,"Charger","Zebronics",700,10);
		inventory_map p4=new inventory_map(104,"Chair","plastic",300,20);
		inventory_map p5=new inventory_map(105,"Tablet","Samsung",50000,25);
		inventory_map p6=new inventory_map(106,"TV","LG",30000,30);
		inventory_map p7=new inventory_map(107,"Speaker","JBL",1000,50);
		inventory_map p8=new inventory_map(108,"Shoes","Nike",5000,30);
		inventory_map p9=new inventory_map(109,"Jeans","H&M",70000,20);
		inventory_map p10=new inventory_map(110,"Camera","canon",70000,10);
		
		map.put(p1.product_id, p1);
		map.put(p2.product_id, p2);
		map.put(p3.product_id, p3);
		map.put(p4.product_id, p4);
		map.put(p5.product_id, p5);
		map.put(p6.product_id, p6);
		map.put(p7.product_id, p7);
		map.put(p8.product_id, p8);
		map.put(p9.product_id, p9);
		map.put(p10.product_id, p10);
	
		for(Entry<Integer, inventory_map> i : map.entrySet()) {
			inventory_map p11=i.getValue();
			System.out.println("Product ID : " +i.getKey() + p11.product_id + ",  Product Name : " + p11.product_name + ",  Price "+ p11.price+ ", Quantity : " + p11.quantity);
			
			
		}
		
	}

}
