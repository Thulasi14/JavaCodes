package programPackage;

public class StringReverseInbuiltReverse {
	
	public static void main(String[] args) {
		
		String a="Thulasi";
		
		StringBuffer s=new StringBuffer(a);
		
		
		StringBuffer s1=new StringBuffer();
		
		s1=s.reverse();
		
		System.out.println(s1);
		
		if(a.equals(s1)){
			System.out.println("Palindrome");
		}
		
		else{
			System.out.println("Not a Palindrome");
		}
	}

}
