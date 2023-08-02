package BasicDSA;

public class SievAlgo {
	public static void main(String[] args) {
		int n = 101;
		boolean[] res = PrimeSeive(n);
		for (int i = 0; i <= n; i++) {

			if (res[i])
				System.out.println(i + " ");
			;
		}
	}

	public static boolean[] PrimeSeive(int n) {
		// we will take last index as
		boolean[] arr = new boolean[n + 1];
		for (int i = 2; i <=n; i++) {
			arr[i] = true;
		}
		for (int i = 2; i * i <= arr.length; i++) {
			if (arr[i] == true) {
				for (int j = 2; j * i < arr.length; j++) {
					arr[j * i] = false;
				}
			}
		}
		return arr;
	}

}
