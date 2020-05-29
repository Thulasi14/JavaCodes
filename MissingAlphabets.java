package programPackage;

import java.util.ArrayList;
import java.util.*;

public class MissingAlphabets {
	
	public static void main(String[] args) {
		
		String a="Thulasi";
		
		String alp="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";//s2
		
		Set<Character> s1=new HashSet<Character>();
		Set<Character> s2=new HashSet<Character>();
		
		
		for(int i=0;i<a.length();i++){
			
			s1.add(a.charAt(i));

		}
		
		for(int i=0;i<alp.length();i++){
			
			s2.add(alp.charAt(i));

		}
		
		System.out.println(s2.size());
		
		//s1.addAll(s2);
		
		//System.out.println(s1);
		
		s2.removeAll(s1);
		
		System.out.println(s2);
		
		System.out.println(s2.size());
		
		
	}

}
