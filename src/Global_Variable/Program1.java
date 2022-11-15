package Global_Variable;

public class Program1 {
	static int i = 40;
    static byte j = 60;
	static int c = i + j;
	static String s = "*****Hello Global Variable*****";
		
	
	public static void main(String[] args) {		// main method body is open
		System.out.println(s);
		System.out.println(i);
        System.out.println(j);
    	System.out.println("Addition is ="+ c);
		
	}

}
