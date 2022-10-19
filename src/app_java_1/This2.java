package app_java_1;
//2  using this keyword we can access non static member of a class 
public class This2 {
	int x = 190;
	public static void main(String[] args) {
		This2 a1 = new This2();
		a1.test();
	}
	public void test() {
		this.test2();
	}
	public void test2() {
		System.out.println(2);
	}
}
