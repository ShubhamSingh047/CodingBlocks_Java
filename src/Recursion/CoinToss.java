package Recursion;

public class CoinToss {
	public static void main(String[] args) {
		CoinToss(3,"");
	}
	public static void CoinToss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(ans.length()==0||ans.charAt(ans.length()-1)!='T') {
			CoinToss(n-1, ans+"T");
		}
		CoinToss(n-1, ans+"H");
	}
}
