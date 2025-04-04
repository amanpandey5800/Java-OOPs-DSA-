package HashMap_Assignments;
import java.util.*;
import java.util.Map.Entry;

public class inventory_mainn  {
	static HashMap<Integer,inventory> map;
	static HashMap<Integer,inventory> bill;
	static inventory product;
	static int r;
	static int q;
	static int choice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map=new HashMap<Integer,inventory>();
		inventory p1=new inventory(101,"Phone", "Google",  35000,  10);
		inventory p2=new inventory(102,"Laptop","Dell",70000,20);
		inventory p3=new inventory(103,"Charger","Zebronics",700,10);
		inventory p4=new inventory(104,"Chair","plastic",300,20);
		inventory p5=new inventory(105,"Tablet","Samsung",50000,25);
		inventory p6=new inventory(106,"TV","LG",30000,30);
		inventory p7=new inventory(107,"Speaker","JBL",1000,50);
		inventory p8=new inventory(108,"Shoes","Nike",5000,30);
		inventory p9=new inventory(109,"Jeans","H&M",70000,20);
		inventory p10=new inventory(110,"Camera","canon",70000,10);
		
		
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
		

		System.out.println(" Product ID " + "|" + "Product Name " + "|" + " Available Units " + "|"  + "Unit Price" + "|" + "Brand");
		
		inventory_functionss.display(map);
		
		System.out.println("================================================================================================");
		
		
//		for(Entry<Integer,inventory> i : map.entrySet()) {
//			inventory p11=i.getValue();
//			System.out.println(i.getKey() + p11.product_id + "   |" + "  Product Name " + "  |" + p11.product_name + " | " + "Price "+ p11.price + " | " + " Quantity : " + p11.quantity);
//			
//		}
		
		do {
		System.out.println("Enter the product ID you want to purchase");
		Scanner sc=new Scanner (System.in);
		q=sc.nextInt();
		System.out.println("Enter the Quantity = ");
		r=sc.nextInt();
		
		System.out.println("If you want to buy something press any key otherwise press 0");
		 choice=sc.nextInt();
		
		if(map.containsKey(q)) {
		product=map.get(q);
				
			if(product.quantity>=r) {
				product.quantity = product.quantity - r;
				System.out.println("Purchase Successfull Remaining quantity of " + product.product_name + " : "+ product.quantity);
				
			}else {
				System.out.println("Insufficient quantity not available . " + product.quantity);
			}
			
		}
		else {
			System.out.println("Product not found ");
		}
		
		
		System.out.println("\n=========================Updated List ===========================\n");
		
		System.out.println("\n\n | Product ID | Product Name | Price | Brand | Quantity");
		inventory_functionss.display(map);
	
		
		bill=new HashMap<Integer,inventory>();
		
		
		
		inventory b1=new inventory(product.product_id,product.product_name,product.price,r);
		bill.put(b1.product_id, b1);
		
		//System.out.println("\n\n============================BILL+++++++++++++++++++==========================\n\n");
		
		
		}while(choice!=0);
		
		inventory_functionss.bill(bill);
		System.out.println("\n\nThanks for your shopping ");
	}
}
