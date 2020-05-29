package Example;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		String s="Welcome";
		char[] a=s.toCharArray();
		
		int j=s.length()-1;
		
		for(char b:a){
			System.out.print(b);
		}
		
		System.out.println();
		
		for(int i=j;i>=0;i--){
			
			System.out.print(a[i]);
			
		}
	}

}
