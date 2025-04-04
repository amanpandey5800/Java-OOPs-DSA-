package Student_ManyOOPs_concepts;

public class student_orig {
	String name;
	int student_id;
	float cc;
	float ml;
	float average_marks;
	
	public student_orig(String name,int stud_id,float cc,float ml) {
		this.student_id=student_id;
		this.name=name;
		this.cc=cc;
		this.ml=ml;
}
	public float average() {
		float average_marks = (cc+ml)/2;
		this.average_marks =average_marks;
		return average_marks;
	}
	
	public int max(student_orig[]) {
		
	}

}