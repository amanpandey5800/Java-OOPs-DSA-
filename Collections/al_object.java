package Collections;
import java.util.*;
public class al_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<studd> a=new ArrayList<studd>();
		
		studd obj=new studd("Aman",01);
		studd obj1=new studd("Kartik",02);
		studd obj2=new studd("Sahil",03);
		
		a.add(obj);
		a.add(obj1);
		a.add(obj2);
		
		for(studd b:a) {
			b.display();
		}
		
			
		for(studd i:a) {
			if(i.id==02) {
				System.out.print("True");
			}
		}
		
		
	}

}
