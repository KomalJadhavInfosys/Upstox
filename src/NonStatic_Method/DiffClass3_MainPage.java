package NonStatic_Method;

public class DiffClass3_MainPage {
	public static void main(String[] args) {
		 DiffClass3_MainPage d = new  DiffClass3_MainPage();
		 d.m1();
		 DiffClass3_Page1 d1 = new DiffClass3_Page1();
		 d1.m2();
		 d1.m3();
		
	
	}
	public void m1() {
		System.out.println("i am m1 from same class");
	}

}
