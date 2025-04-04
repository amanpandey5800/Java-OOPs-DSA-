package Zbooking_ticket;

public class bookingroute {
	String StartingPoint,Endpoint;
	int routeid,Available_seats,Cost;
	
	public bookingroute(int routeid,String StartingPoint,String Endpoint,int Available_seats,int Cost) {
	this.routeid=routeid;
	this.StartingPoint=StartingPoint;
	this.Endpoint=Endpoint;
	this.Available_seats=Available_seats;
	this.Cost=Cost;
	}

}
