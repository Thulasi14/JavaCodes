package Example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringReversalByWords {
	
	public static void main(String[] args) {
		
		String s="Greens Technologies";
		
		String[] s1=s.split(" ");
		
		char[] ch=s1[0].toCharArray();
		char[] ch1=s1[1].toCharArray();
		
		Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		Map<Character,Integer> m1=new LinkedHashMap<Character,Integer>();
		
		for(char a:ch){
			
			if(!m.containsKey(a)){
				
				m.put(a, 1);
				
			}
			
			else{
				m.put(a, m.get(a)+1);
			}
		}
		
		for(char b:ch1){
			
			if(!m1.containsKey(b)){
				
				m1.put(b, 1);
				
			}
			
			else{
				m1.put(b, m1.get(b)+1);
			}
		}
		
		String s3="";
		
		Set<Entry<Character,Integer>> a=m.entrySet();
		Set<Entry<Character,Integer>> a1=m1.entrySet();
		
		for(Entry<Character,Integer> f:a){
			s3=s3+f.getKey();
			s3=s3+f.getValue();
		}
		
		String s4="";
		
		for(Entry<Character,Integer> f1:a1){
			s4=s4+f1.getKey();
			s4=s4+f1.getValue();
		}
		
		System.out.println(s3+" "+s4);
		
	}

}
