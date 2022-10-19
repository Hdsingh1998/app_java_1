package app_java_1;

public class HD {
	static int x1 = 10; // Creating static variable with initialization and can be created without initialized;
	int x2 = 20; // non-static variable with integer value initialized ;
	double x3 = 22.2; // float non-static variable with value 22.2;
	static double x4 = 22.90;
	public static void main(String[] args) {
		HD a1 = new HD();
		int x4 = 78;
		System.out.println(HD.x1);
		System.out.println(HD.x4);
		System.out.println(a1.x3);
		System.out.println(x4);   // 22.90 out
		System.out.println(a1.x2);
		HD.x1 = 55;             // changing static variables value to 55 ;
		System.out.println(HD.x1); // 55 out
		a1.jk();
		HD.pk();
		
            
		
	}
	public void jk() {
		System.out.println("non static void method ");
	}
    public static void pk() {
    	System.out.println("static void method "); 
    }
}