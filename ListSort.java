package programPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class ListSort {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		List<Integer> a1=new ArrayList<Integer>();
		
		a.add(10);
		a.add(12);
		a.add(1);
		a.add(122);
		a.add(101);
		a.add(9);
	
		
		System.out.println(a);
		
		//a1=a.subList(0, 4);
		
		a.subList(0, 2).clear();
		
		System.out.println(a);
		
	/*Collections.sort(a);
	
	System.out.println(a);
		
	Collections.sort(a, Collections.reverseOrder());
		
	System.out.println(a);*/
		
		
		
		

		
	}
	
	
}
