package programPackage;

public class StringSwap {
	
	public static void main(String[] args) {
		
		String s="Thulasi";
		String s1="MadhuMitha";
		
		int h=s.length();
		
	
		
		System.out.println("No of Char in:"+s+":"+h);
		
		System.out.println(s+":"+s1);
		
		String temp=null;
		
		temp=s;
		s=s1;
		s1=temp;
		
		System.out.println(s+":"+s1);
		
		
		String a="abc";
		String b="def";
		
		String c=a.concat(b);
		
		a=c.substring(3);
		b=c.substring(0, 3);
		
		System.out.println(a+":"+b);
		
		
	}

}
