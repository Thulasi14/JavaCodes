package programPackage;

import java.util.*;
import java.util.Map.Entry;

public class CharInaString {
	
	public static void main(String[] args) {
		
		String s="Hi All How are you";
		
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(char a:ch){
			
			if(!m.containsKey(a)){
				
				m.put(a,1);
			}
			else{
				m.put(a,m.get(a)+1);
			}
		
	}
		
		Set<Entry<Character,Integer>> en =m.entrySet();
		
		Iterator<Entry<Character,Integer>> it=en.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
