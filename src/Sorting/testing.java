package Sorting;
import java .util.*;

public class testing {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        for (int k = 0; k < n; k++) {
	            char[][] arr = new char[8][8];
	            for (int i = 0; i < 4; i++) {
	                for (int j = 0; j < 4; j++) {
	                    arr[i][j] = sc.next().charAt(0);
	                }
	            }
	            String ans = Paper(arr);
	            System.out.println(ans);
	        }
	    }

	    public static String Paper(char[][] arr) {
	        StringBuilder ans = new StringBuilder();
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[0].length; j++) {
	                if (arr[i][j] != '.') {
	                    ans.append(arr[i][j]);
	                }
	            }
	        }
	        return ans.toString();
	    }

}
