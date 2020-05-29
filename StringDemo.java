package Example;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String a="Java is a Programing Language";
		String aa="Java";
		String bb="java";
		String cc="          Thulasi             ";
		
		int b=a.length();
		char c=a.charAt(2);
		String d=a.toLowerCase();
		String e=a.toUpperCase();
		int f=a.indexOf('a');
		int g=a.lastIndexOf('a');
		String h=a.replace('a','i');
		String i=a.replaceAll("Language","format");
		boolean j=a.startsWith("java");
		boolean k=a.endsWith("Language");
		boolean l=aa.equals(bb);
		boolean m=aa.equalsIgnoreCase(bb);
		int n=aa.compareTo(bb);
		int o=aa.compareToIgnoreCase(bb);
		String p=a.substring(0,4);
		String q=a.substring(5);
		String r=cc.trim();
		/*char[] dd=a.toCharArray();
		for(char dd1:dd){
			System.out.println(dd1);
		}
*/		
		String[] ee=a.split("a");
		for(String ee1:ee){
			System.out.println(ee1);
		}
		
		
	}

}
