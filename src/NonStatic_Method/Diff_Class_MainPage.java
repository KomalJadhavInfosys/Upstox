package NonStatic_Method;

public class Diff_Class_MainPage {
	public static void main(String[] args) {
		System.out.println("*******Hello NON Static Regular Methods*******");
		
		Diff_Class_MainPage p = new Diff_Class_MainPage();
		p.m1();
		p.m2();
		Diff_Class_Page2 p1 = new Diff_Class_Page2();
		p1.m3();
		p1.m4();
		
	}
	public void m1() {
		System.out.println("Hello I am from Same Class m1");
	}
	public void m2() {
		System.out.println("Hello I am also same class Its m2\n");
	}
	

}
