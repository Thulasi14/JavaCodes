package Example;

public class StringStorage {
	
	public static void main(String[] args) {
		
		String s="Thulasi";
		String s1="Thulasi";
		
		//System.out.println(s.charAt(7));//Exception Scenario
		
		//System.out.println(s.indexOf('z'));//-1 Scenario of String
		
		String e=s.concat(s1);
		
		String a=new String("Thulasi");
		String b=new String("Thulasi");
		
		StringBuffer c=new StringBuffer("Thulasi");
		StringBuffer d=new StringBuffer("Thanapal");
		
		//StringBuffer f=c.append(d);
		StringBuffer p=c.reverse();
		char q=c.charAt(0);
		
		StringBuffer r=d.delete(1, 3);
		
		
		System.out.println(r);
		
		StringBuffer s2=c.replace(0, 3, "Th");
		System.out.println(s2);
		
		System.out.println("Literal");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println();
		
		System.out.println("Non-Literal");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println();
		
		System.out.println("Mutable");
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		
	}

}
