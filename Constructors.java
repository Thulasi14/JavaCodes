package Example;

public class Constructors {
	
	public Constructors(){
		this(4);
		System.out.println("Default Constructor");
	}
	
	public Constructors(int a){
		this(1,2);
		System.out.println("Parameterised Constructor Value:"+a);
	}
	
	public Constructors(int a, int b){
		System.out.println("Parameterised Constructor2 Value:"+a+" "+b);
	}
	public static void main(String[] args) {
		
		new Constructors();
		
	}
}
