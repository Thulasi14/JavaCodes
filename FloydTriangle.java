package programPackage;

public class FloydTriangle {
	
	public static void main(String[] args) {
		
		int row=30;
		int sum=0;
		
		for(int a=1;a<=row;a++){
			sum=sum+a;
		}
		
		//System.out.println(sum);
		/*for(int i=1;i<=row;i++){
			
			for(int j=1;j<i+1;j++){
				
				System.out.print(j+" ");
			}
			System.out.println();
		}*/

		
		int k=1;
		
		for(int i=0;i<row;i++){
			
			for(int j=0;j<i+1;j++){
			
				if(k<=sum){
				System.out.print(k+" ");
				k++;
			}
			
			}
			
			System.out.println();
		}
	}
	

}
