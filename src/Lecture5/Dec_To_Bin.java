package Lecture5;

public class Dec_To_Bin {
	public static void main(String[] args) {
		int n = 87;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 2;
			sum += rem*mul;
			mul*=10;
			n /= 2;
		}
		System.out.println(sum);
	}
}
