package pkg_1;

public class prog_5_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=94382 , sum=0, rem,n=num;
		while(num>0) {
			rem=num % 10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
