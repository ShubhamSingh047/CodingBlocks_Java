package Self_Array;
import java.util.*;

public class DiffernceBetweenTwoelment {
	public static void main(String[] args) {
		int[] arr={2, 3, 10, 6, 4, 8, 1};
		int res=arr[1]-arr[0];
		int minvalue=arr[0];
		int n=arr.length;
		for(int i=1; i<n; i++) {
			res=Math.max(res, arr[i]-minvalue);
			minvalue=Math.min(minvalue, arr[i]);
		}
		System.out.println(res);
		}
}
