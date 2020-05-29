package programPackage;

import java.util.*;

public class MapToMap {
	
	public static void main(String[] args) {
		
		
		Map<Character,Integer> m=new TreeMap<Character,Integer>();
		
		m.put('a',2);
		m.put('b',3);
		m.put('c',4);
		
		
		Map<Character,Integer> m1=new LinkedHashMap<Character,Integer>();
		
		m1.put('s',21);
		m1.put('y',31);
		m1.put('r',41);
		
		m1.putAll(m);
		
		System.out.println(m1);
		
	}

}
