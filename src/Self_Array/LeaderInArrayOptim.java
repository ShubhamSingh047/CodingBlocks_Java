package Self_Array;

public class LeaderInArrayOptim {
	public static void main(String[] args) {
		int[] arr= {6, 17, 4, 3, 5, 2};
		int n=arr.length;
		int cur_leader=arr[n-1];
		for(int i=n-2; i>=0; i--) {
			if(arr[i]>cur_leader) {
				System.out.print(cur_leader+" ");
				cur_leader=arr[i];
			}
		}
		System.out.print(cur_leader);
	}

}
