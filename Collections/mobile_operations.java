package Collections;
import java.util.*;
public class mobile_operations {

		public static void display(ArrayList<mobile_details> mob) {
			for(mobile_details i:mob) {
			System.out.println(" Brand ==  " + i.brand + "\n Model ==  "+ i.model +  "\nPrice == " + i.price + "\n Ram == " + i.ram+" gb");
			System.out.println("------------------------------------------");
		}
		}
		
		public static void pricerange(ArrayList<mobile_details> mob) {
			for(mobile_details i: mob)
			if(i.price <=20000 && i.price>=10000) {
				System.out.println("The Brand is  "+ i.brand);
			}
		}
		public static void ramm(ArrayList<mobile_details> mob) {
		for(mobile_details i : mob) {
		if(i.ram>6 && i.price<50000) {
			System.out.println("The brand is  " + i.brand);
		}
	}
		}
	

}


