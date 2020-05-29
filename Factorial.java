package Example;

public class Factorial {

	
	public static void main(String[] args) {
		
		int a=5;
		int temp=0;
		temp=a;
		
		for(int i=temp-1;i!=0;i--){
			
			temp=temp*i;
		}
		
		System.out.println(temp);
	}	
}

