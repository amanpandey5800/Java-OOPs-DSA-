package Busticketbooking;

import java.util.HashMap;
import java.util.Map.Entry;

public class ticketbooking {
	public static void display(HashMap<Integer,busroute> hm1) {
		for(Entry<Integer,busroute> i : hm1.entrySet()) {
			busroute a=i.getValue();
			System.out.println("routeid = " + a.routeid+ "| StartingPoint = " +a.StartingPoint + " EndPoint  = " + a.Endpoint + "  Available Seats = " + a.Available_seats + " Cost = " + a.Cost);
			
		}
	}
	
	public static void bookticket() {
		
	}

}
