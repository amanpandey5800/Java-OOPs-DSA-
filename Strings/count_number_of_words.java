package Strings;

public class count_number_of_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("I work with mphasis at bangalore");
		String[] w=sb.toString().trim().split(" ");
		int count=w.length;
		System.out.print(count);
		
		
		
	}
}