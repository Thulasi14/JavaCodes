package Example;

public class AsciiCode {
	
	public static void main(String[] args) {
		
		String s="Java Tech";
		
		int s1=s.length();
		int[] p=new int[s1];
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			int b=ch[i];
			p[i]=b;	
			
			System.out.print(ch[i]+":"+p[i]+" ");
		}
		
		System.out.println();
		
		//prime
		
		System.out.println("Prime Values");
		
		for(int j=0;j<ch.length;j++){
			int count =0;
			for(int k=2;k<p[j]/2;k++){
				
				if(p[j]%k==0)
					count=1;
			}
			if(count==0)
			System.out.print(ch[j]);
		}
		
		System.out.println();
		
		//Even
		
		System.out.println("Even Values");
		
		for(int i=0;i<ch.length;i++){
			
			if(p[i]%2==0){
				
				System.out.print(ch[i]);
				
			}
		}
		
		System.out.println();
		//Fibonacci
		
		/*1 1 2 3
		y z */
		System.out.println("Fibocacci Series");
		
		int b=0;
			
				char x=(char) p[b];
				char y=(char) p[b+1];
				char z=(char) (p[b]+p[b+1]);
				
				System.out.println(x+" "+y+" "+z);
				
				b++;	

				
			
			
			}
		}
