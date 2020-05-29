package Example;

public class OddNumbers {

	public static void main(String[] args){
		
		int a=0;
		int count=0;	
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				System.out.println(i);
				a=a+i;
				count++;
			}
		}
		System.out.println("Number of odd no. between 1 and 100:"+count);
		System.out.println("Sum of above odd no. between 1 and 100: "+a);
		
	}
}
