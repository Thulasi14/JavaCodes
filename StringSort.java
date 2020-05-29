package programPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringSort {
	
	public static void main(String[] args) {
		
		String s="thulasi";  
		int n=s.length()-1;
		
		String rotated=s.substring(n)+s.substring(0, n);
		System.out.println(rotated);
		
		String rotated1=s.substring(1,s.length())+s.charAt(0);
		
		System.out.println(rotated1);
		
	}
		
	}

	
