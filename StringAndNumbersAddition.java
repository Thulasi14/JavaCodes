package programPackage;

public class StringAndNumbersAddition {

	public static void main(String[] args) {
		
		String s="abckd34kik98";
		
		String a="";
		String b="";
		
		for(int i=0;i<s.length();i++){
			
		if(Character.isDigit(s.charAt(i))){
		
		a=a+s.charAt(i);
			
		}
		
		}
		
		System.out.println(a);
	}
}
