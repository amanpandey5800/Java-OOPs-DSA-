package POLYMORPHISM;

public class car extends vehicle {
	
		//@override
		public void start() {
			System.out.println("Car has sef -starter");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle vehicle1=new vehicle();
		vehicle1.start();
		
		car car1=new car();
		car1.start();
	}

}
