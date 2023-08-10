package StackAndQueue;
import java.util.*;

public class Others_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 
		for (int i = 1; i <= t; i++) {
			String s = sc.next();
			replace(s, "");
		}

	}

	public static void replace(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		if (ques.charAt(0) == 'p') {
			if (ques.charAt(1) == 'i') {
				replace(ques.substring(2), ans + 3.14);
			}
		} else {
			replace(ques.substring(1), ans + ques.charAt(0));
		}

	}
}