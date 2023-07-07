package Self;

public class StockBuyAndSell {
	public static void main(String[] args) {
		int[] arr={100, 180, 260, 310, 40, 535, 695};
		int profite=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1])
				profite+=arr[i]-arr[i-1];
			
		}
		System.out.println(profite);
	}
}
