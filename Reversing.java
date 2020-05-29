
package Example;
import java.io.*;


public class Reversing {
	
	public static void main(String[] args) {
		
		int a=89998;
		int temp=a;
		/*String s=Integer.toString(a);
		System.out.println(s);
		char b[]=s.toCharArray();*/
		int c[]=new int[5];
		int d[]=new int[5];
		int e[]=new int[5];
		int rem1=0;
		int m=0;//Reversing
		while(a!=0){
			rem1=a%10;
			e[m]=rem1;
			m++;
			a=a/10;
			}
		for(int s=0;s<=4;s++){
			System.out.print(e[s] +" ");
		}
		
		System.out.println();

		int rem=0;//Splitting up the original
		int i=4;
			while(temp!=0){
				rem=temp%10;
				c[i]=rem;
				i--;
				temp=temp/10;
				}
			for(int t=0;t<=4;t++){
				System.out.print(c[t] +" ");
			}	
			
			System.out.println();
			
		for(int p=0;p<=4;p++){
			if(e[p]!=c[p]){
				System.out.println("Not Palindrome");
				return;
			}	
		}
		System.out.println("Palindrome");
	}
	
}
