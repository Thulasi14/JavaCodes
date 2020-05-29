package Example;

public class LeftTriangle {

	public static void main(String[] args) {
		int a=3;
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value:");
		a=scan.nextInt();*/
		
		for(int i=0;i<a;i++){
			
			for(int j=2*(a-i);j>1;j--){

				System.out.print(" ");
				}
				for(int k=0;k<i+1;k++){
					
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
	}
