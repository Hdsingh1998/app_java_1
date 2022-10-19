package app_java_1;
//1. static reference variable are created out side method & inside class can be used any where in class
public class B {       // there are two ways to create static reference variable 
	static B a1 = new B(); // 1st way
	static B a2; // 2nd way //create  (blue italic for static )
	// B a3 = new B(); // error cannot create non static reference variable it's a exception 
	public static void main(String[] args) {
		a2= new B();//Using         // there are two ways to print static 
		System.out.println(B.a2);  // 1st way 
		System.out.println(a2);// 2nd way 
		System.out.println(a1);
		a1.me();
		a2.me();
		B a3 = new B();    // creating local reference variable 
		a3.me();
		System.out.println(a3); // object address 
	}
	public void me() {
		System.out.println(203);
	}

}
