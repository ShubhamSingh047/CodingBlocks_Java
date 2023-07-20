package LeetCode;

import java.util.*;

public class IsplaindromNum9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(1000000001));
		System.out.println(100%10);
		System.out.println(100/10);

	}

	public static boolean isPalindrome(int x) {
		long temp = x;
		long rev = 0;
		if (x < 0)
			return false;
		while (temp != 0) {
			rev += temp % 10;
			rev *= 10;
			temp /= 10;
		}
		rev /= 10;
		System.out.println(rev);
		return rev == x;
	}
}
