package programPackage;

import java.util.*;

public class DuplicateWordsRemoval {
	
	public static void main(String[] args) {
		
		String s1="Java Java works on java Hierarchy on the";
		
		String s=s1.toLowerCase();
		
		String[] st=s.split(" ");
		
		Set<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<st.length;i++){
			
			set.add(st[i]);
		}
		
		System.out.println(set);
		
		String afterDupRemoval="";
		
		//String afterDupRemoval=set.toString();
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext()){
			
			afterDupRemoval=afterDupRemoval+it.next()+" ";
		}
		
		System.out.println(afterDupRemoval);
		
	}

}
 