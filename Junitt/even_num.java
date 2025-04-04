package Junitt;

public class even_num {
		public int sumofeven(int num) {// TODO Auto-generated method stub
		int sum=0,rem;
		while(num>0) {
			rem=num%10;
			if(rem % 2==0) {
				sum=sum+rem;
			}
			num=num/10;
		}
		return sum;
		
	}
}

