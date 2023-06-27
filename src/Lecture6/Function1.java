package Lecture6;

public class Function1 {
	//static variable get update by !
	static int a=7;
	public static void main(String[] args) {
		System.out.println(a+" before");
		call();
		System.out.println(a+" end");
	}
	static void call() {
//		a+=2;
		int a=2;
	}
}
