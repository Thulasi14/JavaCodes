package programPackage;

public class StringAndNumbers {
	
	public static void main(String[] args) {
		
		String s="ab8jded876";
		String a="";
		String b="";
		
		char[] c=s.toCharArray();
		
		for(int i=0;i<s.length();i++){
			
			if(c[i]>=48 && c[i]<=57){
				b=b+c[i];
			}
			else{
				a=a+c[i];
			}
		}
		
		int d=Integer.parseInt(b);
		
		System.out.println(d);
		System.out.println(a);
		
		//int zc=1+d;
		
		//System.out.println(zc);
	}

}
