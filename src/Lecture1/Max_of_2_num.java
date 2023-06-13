package Lecture1;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Max_of_2_num {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b= s.nextInt();
		
		if(a>=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}
}
