package Self;

public class LeaderInArray {
	public static void main(String[] args) {
		int[] arr= {5,4,1,2,3};
		int n=arr.length;
		for(int i=0; i<n; i++) {
			Boolean flag=true;
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag)System.out.print(arr[i]+" ");
		}
	}
}
