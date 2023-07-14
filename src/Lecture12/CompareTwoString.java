package Lecture12;

import java.util.Scanner;

public class CompareTwoString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		if (str1.length() == str2.length()) {
			System.out.println(Equal(str1, str2));
		} else {
			System.out.println(false);
		}

	}

	public static boolean Equal(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
