package Lecture1;

import java.util.Scanner;

public class Marks_qus {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	
	if(m>=75) {
		System.out.println("a");
	}else if(m>=65) {
		System.out.println("b");
	}else if(m>=45){
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
}
}
