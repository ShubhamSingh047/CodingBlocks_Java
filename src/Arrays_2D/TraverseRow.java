package Arrays_2D;

public class TraverseRow {
	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3},
				{5,6,7},
				{8,9,10},
				{1,2,3}
				};
//		System.out.println(arr.length);=row
//		System.out.println(arr[0].length);=col;
		
		for(int col=0; col<arr[0].length; col++) {
			for(int row=0; row<arr.length; row++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
