package Assignment_3;

public class student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_data a=new Student_data("Aman",12,55,60);
		float num=a.average();
		a.show();
		
		Student_data b=new Student_data("Sahil",13,55,70);
		float num2=b.average();
		b.show();
		
		Student_data c=new Student_data("Harshit",10,15,70);
		float num3=c.average();
		c.show();
		
		if(num>num2 && num>num3) {
			System.out.println("\nthe hihghest marks is scored by " + a.student_name + "is "+ num);

		}
		else if(num2>num && num2>num3)
		{
					System.out.println("\nthe highest marks is scored by " + b.student_name + " is " + num2);
			}
		else {
			System.out.println("\nthe average marks is scored by " + c.student_name + "is "+ num3);
		}
		}

}
