package programPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.xml.internal.ws.util.StringUtils;

public class SplCharactersFindingString {
	
	public static void main(String[] args) {
		
		//String a="Thul%$$+s^^";
		
		/*int b=0;
		
		String s="";
		
		System.out.println(a);
		
		for(int i=0;i<a.length();i++){
			
			b=(int)a.charAt(i);
		
		if(b>=33 && b<=46) {
			
			s=s+(char)b;
		}
			
		else if(b>=58 && b<=64) {
			
			s=s+(char)b;
		}
			
		else if(b>=91 &&b<=96){
			s=s+(char)b;
		}
			
		else if( b>=123 && b<=127){
			s=s+(char)b;
		}
		
		}
			
		System.out.println(s);*/
		
		
		/*Pattern pat=Pattern.compile("[a-zA-Z0-9]*");
		Matcher mat=pat.matcher(a);
		
		if(!mat.matches()){
			System.out.println("String has ANChar");
		}
		else{
			System.out.println("No ANChar");
			
		}*/
		
		String a="Thul%$$+s^^";
		String b="";
		
		for(int i=0;i<a.length();i++){
			
			if(Character.isAlphabetic(a.charAt(i))){
				continue;
			}
			
			else if(Character.isDigit(a.charAt(i))){
				continue;
			}
			
			else{
				b=b+a.charAt(i);
			}
		}
		
		System.out.println(b);
	}

}
