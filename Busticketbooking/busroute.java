package Busticketbooking;

public class busroute {
	
	String StartingPoint,Endpoint;
	int routeid,Available_seats,Cost,booking_id,no_of_seats,total_amount;
	
	public busroute(int routeid,String StartingPoint,String Endpoint,int Available_seats,int Cost) {
		this.routeid=routeid;
		this.StartingPoint=StartingPoint;
		this.Endpoint=Endpoint;
		this.Available_seats=Available_seats;
		this.Cost=Cost;
		
	}
	
	
	
	
	
}
