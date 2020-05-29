package Example;

import java.util.Scanner;

public class Abc extends FactorialRecursive{

	public static void main(String[] args){
		
		int a[]=new int[4];
		int []b=new int[6];
		int c[][]=new int[2][3];
		
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=3;
		
		c[0][0]=1;
		c[0][1]=2;
		c[0][2]=3;
		
		c[1][0]=1;
		c[1][1]=2;
		c[1][2]=3;
		
		for(int d[]:c){
			for(int v:d){
				System.out.print(v +" ");
			}
			System.out.println();
		}
		
		//Arrays.stream(c).forEach(System.out::println());
		/*for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++){
				
				c[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++){
				
				System.out.print(c[i][j] +" ");
			}
			
			System.out.println();
			System.out.println(c[i].length);
		}
		
	 int d=c.length;
	 
	 System.out.println(d);*/
	}
}
