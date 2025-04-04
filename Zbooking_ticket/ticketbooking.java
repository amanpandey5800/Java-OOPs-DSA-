package Zbooking_ticket;

import java.util.HashMap;
import java.util.Map.Entry;

public class ticketbooking {
	public static void display(HashMap<Integer,bookingroute> hm1) {
		for(Entry<Integer,bookingroute> i : hm1.entrySet()) {
			bookingroute br=i.getValue();
			System.out.println("routeid = " + br.routeid);
			System.out.println("StartingPoint = " + br.StartingPoint);
			System.out.println("routeid = " + br.Endpoint);
			System.out.println("routeid = " + br.Available_seats);
			System.out.println("Cost " + br.Cost);
		}
	}
}
