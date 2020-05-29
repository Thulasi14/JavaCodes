package Example;
import java.util.Scanner;
public class Armstrong {
	
	public static void main(String[] args) {
		
	int a;
	int temp;
	int temp1;
	int count=0;
	int c=0;
	int rem=0;

	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	temp=a;
	temp1=a;
	
	
	
	while(temp!=0){
		rem=temp%10;
		c=c+(rem*rem*rem);
		temp=temp/10;
		//System.out.println(c);
	}	
	
	System.out.println("The Value of c:"+c);
	
	if(c==a)
		System.out.println("It is an Armstrong Number");
	else
	System.out.println("It is not an Armstrong Number");
		
	}
}