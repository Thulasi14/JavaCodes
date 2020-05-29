package programPackage;

public class ReversingNumber {
	
	public static void main(String[] args) {
		
		int a= 1221;
		int actual=a;
		int rev=0;
		int rem=0;
		
		
		while(a!=0){
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		
		System.out.println("Reversed Number:"+rev);
		
		if(actual==rev){
			System.out.println("Number is palidrome");
		}
		
		else{
			System.out.println("Number is Not a palidrome");
		}
		}
	}


