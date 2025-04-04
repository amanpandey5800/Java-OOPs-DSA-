package Junitt_assignment;

public class student_data {
	private int ai;
	private int ds;
	private int ml;
	
	
//	public student_data( ) {
//		this.ai=ai;
//		this.ds=ds;
//		this.ml=ml;
//	} 
	
	public int average(int ai,int ds,int ml) {
		int avg=(ai+ds+ml)/3;
		return avg;
	}

}
