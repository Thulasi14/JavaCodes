package programPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateValueinString {
	
	public static void main(String[] args) {
		
		String s1="Fillif";
		
		String s=s1.toLowerCase();
		
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(Character c:ch){
			if(!m.containsKey(c)){
				m.put(c, 1);
			}
			
			else{
				m.put(c, m.get(c)+1);
			}
		}
		
		System.out.println(m);
		
		
		/*for(int k=0;k<ch.length;k++){
			int count=0;
			for(int l=0;l<ch.length;l++){
				if(ch[k]==ch[l]){
					count++;
					}
			}
			System.out.println("Number of occurance of:"+ch[k]+":"+count);
		}*/
		
	}

}
