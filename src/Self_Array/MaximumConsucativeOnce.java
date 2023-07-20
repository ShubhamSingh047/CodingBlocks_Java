package Self_Array;

public class MaximumConsucativeOnce {
	public static void main(String[] args) {
		int[] arr= {0,1,1,0,1,0};
		int res=0;
		int count=1;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]&& arr[i]==1) {
				count++;
				res=Math.max(count, res);
			}else {
				count=1;
			}
		}
		System.out.println(res);
	}
}
