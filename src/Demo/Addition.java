package Demo;

public class Addition {

	public static void main(String[] args) {
		add(20, 30);
		add(30, 30, 40);

	}

	public static double add(int a, int b) {
		System.out.println(  (a + b));
		return b;
	}

	public static double add(int a, int b, int c) {
		System.out.println(a + b + c);
		return c;
	}
	

}


