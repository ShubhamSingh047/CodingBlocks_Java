package Self;

public class MaximumSubArrayOptimum {
public static void main(String[] args) {
	int[] arr= {0,1,1,0,1,0};
	int res=arr[0];
	int maxEnd=arr[0];
	for(int i=1; i<arr.length; i++) {
		maxEnd=Math.max(maxEnd+arr[i], arr[i]);
		res=Math.max(maxEnd,res);
	}
	System.out.println(res);
}
}
