package app_java_1;
//1  this keyword is a special reference variable which gets created automatically
//2  using this keyword we can access non static member of a class 
//3  We cannot use this keyword in static method 
//4  using this keyword we can use static members but its wrong way jvm corrects the mistake by putting class name instead of this keyword  
//5  this keyword points to the object currently running in the program 
//6  in below program this keyword gets added automatically 
//   psvm(){ A a1 = new A();
//   a1.test();}  public void test (){ sop (x); // this.x}}
//  this is used for non static member name 
//  this() - it is used to call constructor from another constructor and should all ways be the 1st statement
public class This {
	int x = 10;
	public static void main(String[] args) {
		This a1 = new This();//1  this keyword is a special reference variable which gets created automatically
		System.out.println(a1);
		This a2 = new This();//2  using this keyword we can access non static member of a class
		System.out.println(a2.x);
		a2.tes();
	}
	public void test() {
		System.out.println(this);
	}
	public void tes() {
		System.out.println(this.x);
	}
}
