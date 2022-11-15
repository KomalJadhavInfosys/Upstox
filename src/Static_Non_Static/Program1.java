package Static_Non_Static;

public class Program1 {
	static int i=20;	// Static global variable
	byte j=60;			// Non static global Variable
	int c = i+j;
	public static void main(String[] args) { // main method body start
		Program1 p =  new Program1();
		System.out.println(i);
		System.out.println(p.j);
		System.out.println("Addition = "+ p.c);
	}

}
