package programPackgae2;

public class InsertingStringintoaStringusingIndex {
	
	public static void main(String[] args) {
		
		/*StringBuffer a=new StringBuffer("MakeEasy");
		StringBuffer b=new StringBuffer("Selenium");
		StringBuffer c;
		a.insert(4, b);
		System.out.println(a);*/
		
		String x="The Software";
		String y="Selenium";
		
		int index=3;
		
		String lasthalf=x.substring(index);
		String firsthalf=x.substring(0,index)+" ";
		String concatenated=firsthalf.concat(y);
		
		System.out.println(concatenated+lasthalf);
		
		
	}

}
