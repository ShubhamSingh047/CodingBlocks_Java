package Lecture27;

public class Client {
	public static void main(String[] args) {
//		Case1
//		Class_P obj=new Class_P();
		
//		case2
		Class_P obj2=new Class_C();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		
		//we need to type cast this obj for class C as this will go through compile error as it will be making
		// type for obj class_p so we will type cast the object to class_C();
		
		System.out.println(((Class_C)(obj2)).d2);
		
//		figure out reson
		obj2.fun();
		obj2.fun1();
		((Class_C)(obj2)).fun2();
		
//		Case3
		//this is not allowed
//		Class_C obj3 = new Class_P();
//		System.out.println();
		
		//case4
		System.out.println("Case 4");
		Class_C obj4= new Class_C();
		System.out.println(obj4.d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
//		in case we want to access parent d variable
		System.out.println(((Class_P)(obj4)).d);
		
		//this will always be obj.fun refernce to new keyword associated class method.  
		obj4.fun();
		obj4.fun1();
		obj4.fun2();
	}
}
