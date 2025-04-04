package JDBC_assignment;

public class student {
	int sid;
	String smarks;
	static int phy;
	static int chem;
	static int avg;
	
	public student(int sid,String smarks,int phy,int chem,int avg) {
		this.sid=sid;
		this.smarks=smarks;
		this.phy=phy;
		this.chem=chem;
		this.avg=avg;
	}
	
	
	
	public static int average(int phy,int chem) {
		int average = (phy+chem)/2;
		return average;
	}



}
