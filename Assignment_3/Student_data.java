package Assignment_3;

public class Student_data {
	String student_name;
	int student_id;
	float marks_cc;
	float marks_ml;
	float avg;
	
	public Student_data(String student_name,int student_id,float marks_cc,float marks_ml) {
		this.student_name=student_name;
		this.student_id=student_id;
		this.marks_cc=marks_cc;
		this.marks_ml=marks_ml;
	}
	
	public float average() {
		float avg=(marks_cc+marks_ml)/2;
		this.avg=avg;
		return avg;
	}
	
	public void show() {
		System.out.println("==========================");
		System.out.println("The average marks scored by " + this.student_name + " is " + avg);
	}
	
}
