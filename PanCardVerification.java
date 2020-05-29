package programPackage;

public class PanCardVerification {
	
	public static void main(String[] args) {
		
		String a = "Abcde13pq";
		
		int len=a.length();
		
		int i=0;
		
		while(i<len){
			
			if(i<5){
				if(Character.isAlphabetic(a.charAt(i))){
					continue;
				}
				else{
					break;
				}
			}	
				else if(i<7 && i>5){
					if(Character.isDigit(a.charAt(i))){
						continue;
					}
					else{
						break;
					}
				}
				else{
					if(Character.isAlphabetic(a.charAt(i))){
						continue;
					}
					else{
						break;
					}
				}
				
				i++;	
		}
	}

}
