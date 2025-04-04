package Inventory_testing;

public class inventoryy {
	String product_name,brand;
	int price,product_id,quantity;
	
	
	
	public  inventoryy(int product_id,String product_name,String brand,int price,int quantity) {
		this.product_id=product_id;
		this.product_name=product_name;
		this.brand=brand;
		
		this.price=price;
		
		this.quantity=quantity;
	
	}

	public inventoryy(int id,String prd_name,int cost,int no_of) {
		this.product_name=prd_name;
		this.price=cost;
		this.quantity=no_of;
	}
}
