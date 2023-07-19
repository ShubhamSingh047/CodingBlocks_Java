package Recursion;

public class PrintZikZak {
	public static void main(String[] args) {
		Print(2);
	}
	public static void Print(int n) {
		if(n==0)return;
		System.out.print(n+" ");
		Print(n-1);
		System.out.print(n+" ");
		Print(n-1);
		System.out.print(n+" ");
	}
}
