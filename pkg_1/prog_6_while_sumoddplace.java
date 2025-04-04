package pkg_1;

public class prog_6_while_sumoddplace {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=94382,sum=0,rem,n=num;
		
		int pos=5;
		while(num>0) {
			rem=num%10;
			if(pos %2 !=0){
				sum=sum+rem;
			}
			num=num/10;
			pos--;
		}
		System.out.print(sum);
	}

}
