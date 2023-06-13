package Lecture1;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1;
		 while(i<=10) {
			 if((n*i)%3!=0) {
				 System.out.println(n*i);
			 }
			 i++;
		 }
	}
}
