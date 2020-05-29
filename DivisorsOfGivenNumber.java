package programPackage;

import java.util.ArrayList;

public class DivisorsOfGivenNumber {
	
	public static void main(String[] args) {
		
	int n=81;
	
	ArrayList<Integer> a=new ArrayList<Integer>();
	
	for(int i=1;i<n;i++){
		
		if(n%i==0){
			a.add(i);
		}	
		
	}
	
	System.out.println(a);
	}

}
