package Example;

import java.util.*;

public class MapProgram2 {
	
	public static void main(String[] args) {
		
		String s="Welcome to Java Class and Welcome Java";
		
		String[] a=s.split(" ");
		
		Map<String,Integer> m1=new LinkedHashMap();
		
		for(String b:a){
			
			if(!m1.containsKey(b)){
				m1.put(b,1);
			}
			
			else{
				m1.put(b,m1.get(b)+1);
			}
		}
		
		System.out.println(m1);
		
			
	}

}
