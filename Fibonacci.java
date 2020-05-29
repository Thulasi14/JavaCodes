package Example;

import java.util.Scanner;

import sun.security.jca.GetInstance;

public class Fibonacci {
	
	public static void main(String[] args){
		
	//0,1,1,2,3,5,8,13
		
		int a;
		int b;
		
		System.out.println("Enter the value of a and b:");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		int temp=0;
		System.out.print(+a +" "+b +" ");
		
		for(int i=1;i<=10;i++){
		temp=a+b;
		System.out.print(temp+" ");
		a=b;
		b=temp;
		}
	}
	
	
	

}
