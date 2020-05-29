package programPackage;

public class PositionofAlphabet {
	
	public static void main(String[] args) {
		
		char ch='F';
	
		int a=(int)ch;
		
		if(a>=65 && a<=90){
			
			int b=a-64;
			
			System.out.println(b);
			
		}
		
		else if(a>=97 && a<=122){
			int b=a-96;
			
			System.out.println(b);
			
		}
		else{
			
			System.out.println("Invalid Alphabet");
		}
	}

}
