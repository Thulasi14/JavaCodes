package Example;

public class StringDemo3 {
	public static void main(String[] args) {
		
		String s="Welcome to Java Class";
		String[] a=s.split(" ");
		
		System.out.println(s);
		
		/*System.out.println("Splitted String s:");
		for(String b:a){
			System.out.println(b);
		}*/
				
		for(int i=0;i<a.length;i++){	
			
			char[] b=a[i].toCharArray();
			int l=b.length-1;
			
			for(int j=l;j>=0;j--){
				System.out.print(b[j]);
				
			}
			
			System.out.print(" ");
			
		}
	}
}
