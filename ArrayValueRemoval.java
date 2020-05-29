package programPackage;

public class ArrayValueRemoval {
	
	public static void main(String[] args) {
		
		
		//String a[]={"Google","Yahoo","Gmail","Twitter"};
		
		String a="Google";
		char b[]={'a','e','i','o','u'};
		
		String[] s=new String[a.length()];
		
		s=a.split("");
		
		int count=1;
		
		for(int i=0;i<s.length;i++){
			
			for(int j=0;j<b.length;j++){
				
				if(s[i].equals(b[j])){
					count++;
					System.out.println(count);
				}
				
			}
		}
		
			if(count>=2)
				System.out.println(a+" Has more than 2 Vowels");
			
			else
				System.out.println("Google");
			
			
		}

}
