package Recursion_Class_lecture;

public class Rat_In_Maje {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		char[][] arr=new char[n][m];
		for(int i=0; i<arr.length; i++) {
			String s=sc.next();
			for(int j=0; j<s.length(); j++) {
				arr[i][j]=s.charAt(j);
			}
		}
	}
}
