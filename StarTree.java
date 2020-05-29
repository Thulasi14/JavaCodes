package Example;

public class StarTree {
	public static void main(String[] args){
		
		int f[]={10,20,34,4,67};
		for(int i=1;i<=4;i++){
			for(int j=0;j<i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int a=1;a<=4;a++){
			for(int b=4;b>=a;b--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}
