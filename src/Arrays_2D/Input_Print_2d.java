package Arrays_2D;
import java.util.*;

public class Input_Print_2d {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter row and column respectively");
		int row=s.nextInt();
		int col=s.nextInt();
		int[][] arr= new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println();
		System.out.println("your 2_D Array is :-");
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
