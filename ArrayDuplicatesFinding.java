package programPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicatesFinding {
	
	public static void main(String[] args) {
		
		String[] s={"Thulasi","Rose","Lily","Rose","Thulasi","Thulasi","Rose"};
		
		Set<String> a=new HashSet<String>();
		
		int len=s.length;
		
		for(int i=0;i<len;i++){
			
			for(int j=i+1;j<len;j++){
				
				if(s[i].equals(s[j])){
					
					a.add(s[i]);
					
				}
			}
		}
		
		
		System.out.println("Duplicates in an Array");
		System.out.println(a);
		
		
	}

}
