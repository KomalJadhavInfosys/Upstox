package NonStatic_Method;

public class SameClass_MainPage {
	public static void main(String[] args) {
		System.out.println("*******Hello Methods******");
		 SameClass_MainPage p = new  SameClass_MainPage();
		 p.m1();
		 p.m2();
		
		
	}
	public void m1() {
		System.out.println("I am m1 From Same Class");
	}
	public void m2() {
		System.out.println("I am m2 From Same Class");
	}

}
