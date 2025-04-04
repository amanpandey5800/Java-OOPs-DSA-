package Hashmap;

public class inventory_map {
	String product_name,brand;
	int price;
	public int product_id;
	int quantity;
	
	
	public inventory_map(int product_id,String product_name,String brand,int price,int quantity) {
		this.product_name=product_name;
		this.brand=brand;
		
		this.price=price;
		this.product_id=product_id;
		this.quantity=quantity;
	}
	
}
