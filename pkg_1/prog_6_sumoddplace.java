package pkg_1;

public class prog_6_sumoddplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=94382,sum=0,rem;
		for(int i=1;i<=num;i++) {
			rem=num%10;
			if(i%2 !=0) {
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.print(sum);

	}

}
