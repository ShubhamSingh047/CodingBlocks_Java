package Self_Array;

public class CyclicAdiition {
	public static void main(String[] args) {
		int arr[]= {1,2,5,6,8};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+arr[arr.length-i-1]);
		}
	}
}
