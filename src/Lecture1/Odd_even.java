package Lecture1;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("Odd");
		}
	}
}
