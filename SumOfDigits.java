package Example;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int a=459;
		int temp=0;
		int c=0;
		int d=0;
		int rem;
		temp=a;
		int rem1=0;
		while(temp!=0)
		{
			rem=temp%10;
			c=c+rem;
			temp=temp/10;
		}
		if(c>9){
			while(c!=0){
			rem1=c%10;
			d=d+rem1;
			c=c/10;	
		}
			System.out.println(d);
			return;
		}
		
		System.out.println(c);
	}
	
	
	
	
	

}
