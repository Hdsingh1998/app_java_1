package app_java_1;

public class A {
	static int x1 = 45;  // italic blue means static 
	int z = 565;  // just blue means non static
	public static void main(String[] args ) {
		A a1 = new A();
		System.out.println(x1);
		a1.test();
		int x = 167;  // brown means local variable 
		System.out.println(x);
	}

	private void test() {
		System.out.println(300);
	}
}
