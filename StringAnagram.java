package programPackage;

public class StringAnagram {
	
	public void anagram(String s,int length){
	
		int prob=1;
		while(length!=0){
			prob=prob*length;
			length--;
		}

		System.out.println("Probablity:"+prob);	
		char[] ch=s.toCharArray();
		
		
		String[] str=new String[prob];
		str[0]=s;
		
		for(int i=0;i<prob-1;i++){
			
			
			
		}
		
		for(String sw:str){
		System.out.println(sw);
		
		}
		
	}
	
	public static void main(String[] args) {
		
		String s="abc"; //acb a
		int n=s.length();
		
		StringAnagram sa=new StringAnagram();
		
		sa.anagram(s, n);
		
	}

}
