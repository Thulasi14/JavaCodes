package programPackage;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
		
		int[] a={11,12,13,14,15,17};
		
		int missinngnumber=0;
		
		int count=a[0];
		
		for(int i=0;i<a.length;i++){
		
			if(a[i]==count){
				
				count++;
				
			}
			
			else{
				missinngnumber=count;
				break;
			}
				
		}
		
		System.out.println(missinngnumber);
	}

}
