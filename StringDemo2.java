package Example;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		String s="Welcome to Java Class";
		char[] a=s.toCharArray();
		
		for(char b:a){
			System.out.print(b);
		}
		

		System.out.println();
		int j=s.length()-1;
		
		for(int i=j;i>=0;i--){
			System.out.print(a[i]);
		}
		
	}

}
