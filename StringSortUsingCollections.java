package programPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringSortUsingCollections {
	
	public static void main(String[] args) {
		
		String s1="Thulasi";
		
		String s=s1.toLowerCase();
		
		ArrayList<Character> l=new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++){
			l.add(s.charAt(i));
		}
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		String sorted="";
		
		for(Character c:l){
			
			sorted=sorted+c;
		}
		
		System.out.println(sorted);
		
		
	}

}
