package Example;

public class EvenNumbers {
	
	

	public static void main(String[] args){
	
	int a=0;
	//int b=0;
	int count=0;
	//int count1=0;
	for(int i=1;i<=100;i++){
		if(i%2==0){
			System.out.println(i);
			a=a+i;
			count++;
		}
		
		/*else{
			System.out.println(i);
			b=b+i;
			count1++;
		}*/
	}
	System.out.println("Number of even no. between 1 and 100:"+count);
	System.out.println("Sum of above Even no. between 1 and 100: "+a);
	
	/*System.out.println("Number of odd no. between 1 and 100:"+count1);
	System.out.println("Sum of above odd no. between 1 and 100: "+b);*/
	
}
}

