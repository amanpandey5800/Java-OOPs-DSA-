package Collections_comparator;

import java.util.Comparator;

import COLLECTIONSS.student;

public class studentt  implements Comparable<studentt>{ 

		public String name;
		public int id;
		public int age;
		
		public studentt(String name,int id,int age) {
			this.name=name;
			this.id=id;
			this.age=age;
			
		}
		public void display() {
				System.out.println(name + " " + id+ " "+ age);
			}
		
		//@override
		public int compareTo(studentt s) {
			return this.age-s.age;
		}
		
		}

		

