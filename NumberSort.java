package programPackage;

public class NumberSort {
	public static void main(String[] args) {
		
		int[] h={2,2,33,61,97,12,1};
		
			for(int i=0;i<h.length;i++){
			int temp=0;
			for(int j=i+1;j<h.length;j++){
				
				//< than Descending//> than Ascending
				if(h[i]<h[j]){
					
					temp=h[i];
					h[i]=h[j];
					h[j]=temp;	
				}
			}
			
		}
		for(int k=0;k<h.length;k++){
			System.out.println(h[k]);
		}
		
	}

	
}
