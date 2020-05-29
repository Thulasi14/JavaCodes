package Example;

public class SubClass extends Constructors{
	
	public SubClass() {
		this(3,5.5f,9);
		System.out.println("Default Constructor1");
	}
	public SubClass(String f){
		System.out.println("Parameterised Constructor Value:" +f);
	}
	
	public SubClass(int a, float b, int c){
		this("Thulasi");
		System.out.println("Parameterised Constructor2 Value:"+a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		new SubClass();
	}
}
