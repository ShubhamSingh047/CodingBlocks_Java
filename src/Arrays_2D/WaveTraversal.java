package Arrays_2D;

import java.util.Scanner;

public class WaveTraversal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		PrintWave(arr, row, col);
	}

	public static void PrintWave(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		for (int j = 0; j < arr[0].length; j++) {
			if(j%2==0) {
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			else {
				for(int i=arr.length-1; i>=0; i--) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
