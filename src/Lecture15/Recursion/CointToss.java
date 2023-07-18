package Lecture15.Recursion;

public class CointToss {
	public static void main(String[] args) {
		int n=3;
		CoinPrint(0,"",n);
	}
	public static void CoinPrint(int s,String ans, int n) {
		if (s==n) {
			System.out.println(ans);
			return ;
		}
		CoinPrint(s+1, ans+"H", n);
		CoinPrint(s+1, ans+"T", n);	
	}
}
