package Example;

public class Swapping {
	
	public static void main(String[] args){
	int a=10;
	int b=20;
	
	b=a+b;
	a=b-a;
	b=b-a;
	
	System.out.println("Swapped Values of a & b:"+a +"&"+ b);
	
	/*int temp=0;
	
	System.out.println("Values before swapping");
	System.out.println("a:"+a +'\t'+ "b:"+b);
	
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("Values after swapping");
	System.out.println("a:"+a +'\t'+ "b:"+b);*/
	
	}
}
