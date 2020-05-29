package programPackage;

import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
	
	public static void main(String[] args) {
		
		String s1="Yakky";
		
		String s=s1.toLowerCase();
		
		char[] ch=s.toCharArray();
		
		char firstNonRepeatedChar='\0';
		
		for(int i=0;i<ch.length;i++){
			
			int count=0;
			
			for(int j=i+1;j<ch.length;j++){
				
				if(ch[i]==ch[j]){
					count++;
				}
			}
			
			if(count==0){
				firstNonRepeatedChar=ch[i];
				break;
			}
			
		}
		
		System.out.println(firstNonRepeatedChar);
		
		
		}
		
	}


