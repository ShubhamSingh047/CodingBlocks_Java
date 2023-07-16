package Self;

public class Maximum_Consucative_Ones {
	public static void main(String[] args) {
	int[] arr= {2,3,1,1,1,4,5,1,1,1,1,1,5,1};
	int max=0; int count=0;
	int n=arr.length;
	for(int i=0; i<n; i++) {
		if(arr[i]!=1) {
			max=Math.max(count,max);
			count=0;
		}else {
			count++;
		}
	}
	System.out.println(max);
	}
}
