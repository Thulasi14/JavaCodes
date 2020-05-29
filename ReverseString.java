package programPackage;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String s1="Malayalam";
		String s=s1.toLowerCase();
		
		String temp=s;
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(temp.equals(rev)){
			System.out.println("String is Palidrome");
		}
		
		else{
			System.out.println("String is Not a Palidrome");
		}
	}
}
