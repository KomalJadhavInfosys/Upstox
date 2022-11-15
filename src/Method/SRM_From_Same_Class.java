package Method;

public class SRM_From_Same_Class {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		m1();
		m2();
		System.out.println("Main Method Ended");
		
	}
	public static void m1() {
		System.out.println("I am method m1");
	}
	public static void m2() {
		System.out.println("I am method m2");
	}
}
