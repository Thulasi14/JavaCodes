package Example;

public class ReversingString {
	
	public static void main(String[] args) {
		
		String s3="Malayalam";
		
		String s=s3.toLowerCase();
		
		System.out.println("Given String:"+s);
		
		String s1="";
		
		char[] ch=s.toCharArray();
		
		int j=0;
		
		for(int k=ch.length-1;k>=0;k--){
			
			s1=s1+ch[k];
			
		}
		
		System.out.println("Reversed String:"+s1);
		
		for(int i=ch.length-1;i>=0;i--){
			
			
			if(ch[i]!=s.charAt(j)){
				System.out.println("Hence string is Not a Palindrome");
				return;	
			}
			
			j++;
		}
		
		System.out.println("Hence string is a Palindrome");
			
	}

}
