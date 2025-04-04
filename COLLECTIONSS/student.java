package COLLECTIONSS;

public class student implements Comparable<student>{
	public String name;
	public int id;
	public int age;
	
	public student(String name,int id,int age) {
		this.name=name;
		this.id=id;
		this.age=age;
		
	}
	
	public void display() {
		System.out.println(name + " " + id + " " + age);
	}
	
	@Override
	public int compareTo(student s)
	{
		//return this.age -s.age;// ascending
		return s.age - this.age; // descending
	}
}