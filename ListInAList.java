package programPackage;

import java.util.*;

public class ListInAList {
	
	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>(Arrays.asList("Rose,Hibiscus,Thulasi"));
		List<String> l2=new ArrayList<String>(Arrays.asList("T,T,K"));
		List<String> l3=new ArrayList<String>(Arrays.asList("Red,Yellow,Orange"));
		
		List<List<String>> a=new ArrayList<List<String>>();
		
		a.add(l1);
		a.add(l2);
		a.add(l3);
		
		System.out.println(a);
		
		List<List<List<String>>> b=new ArrayList<List<List<String>>>();	
		
		b.add(a);
		
		System.out.println(b);
		
		
		}

}
