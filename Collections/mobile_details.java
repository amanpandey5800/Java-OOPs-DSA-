package Collections;
//import java.util.Scanner;
public class mobile_details {

	String brand;
	String model;
	int price;
	int ram;
	String s;
	public mobile_details(String brand,String model,int price,int ram) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.ram=ram;
	}
	
	void display() {
		System.out.println(" Brand ==  " + brand + "\n Model ==  "+ model +  "\nPrice == " + price + "\n Ram == " + ram+" gb");
		System.out.println("------------------------------------------");
	}
	
	public void search() {

		if(this.brand=="Apple") {
			display();
						}
		}
	 
//	
//	public void pricerange() {
//		if(this.price <=20000 && this.price>=10000) {
//			display();
//		}
//	}
//	
//	public void ramm() {
//		if(this.ram>6 && this.price<50000) {
//			display();
//		}
//	}
	
}



