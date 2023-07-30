package Arrays_2D;

import java.util.Scanner;

public class Mult_Of_2D {
	public static void main(String[] args) {
		TakingInput2D();

	}

	public static void TakingInput2D() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row and col respectively for arr1");
		int row = s.nextInt();
		int col = s.nextInt();
		int arr1[][] = new int[row][col];
		System.out.println("Enter "+row+"<-row x col->"+col);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter row2 and col2 respectively for arr2");
		int row2 = s.nextInt();
		int col2 = s.nextInt();
		if (col != row2) {
			System.out.println("Not possible");
			return;
		}
		System.out.println("Enter "+row2+" <- row2 x col2-> "+col2);
		int arr2[][] = new int[row2][col2];
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				arr2[i][j] = s.nextInt();
			}
		}
		DoingOperation(arr1, arr2);
	}

	public static void DoingOperation(int[][] arr1, int[][] arr2) {
		// TODO Auto-generated method stub
		int temp[][] = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					temp[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[0].length; j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}
}
