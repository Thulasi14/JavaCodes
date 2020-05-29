package programPackage;

public class LagestAndSmallestinArray {
	
	public static void main(String[] args) {
		
		int[] a={110,2,87,980,1};
		
		int len=a.length;
		
		int temp=a[0];
		
		int small=0;
		int big=0;
		
		for(int i=0;i<len;i++){
			if(a[i]<temp){
				small=a[i];
			}
		}
		
		System.out.println(small);
		
		for(int i=0;i<len;i++){
			if(a[i]>temp){
				big=a[i];
			}
		}
		
		System.out.println(big);
	}

}
