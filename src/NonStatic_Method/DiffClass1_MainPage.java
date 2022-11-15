package NonStatic_Method;

public class DiffClass1_MainPage {
	public static void main(String[] args) {
		System.out.println("Hello Good Morning");
		DiffClass1_Page1 r = new DiffClass1_Page1();
		r.m1();
		DiffClass1_Page2 p = new DiffClass1_Page2();
		
		p.m2();
	}

}
