package Example;

import java.util.*;

public class MapProgram {
	
	public static void main(String[] args) {
		//To get w=1,e=2,l=1,c=1,o=1,m=1
		
		String s="Welcome";
		
		int i=0;
		
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> m=new LinkedHashMap<Character, Integer>();
		
		for(char c:ch){
			
			if(!(m.containsKey(c)))
			{
			m.put(c, 1);
			}
			
			else{
			m.put(c, m.get(c)+1);
			}
			
		}
		
		System.out.println(m);
			}
		
		}

