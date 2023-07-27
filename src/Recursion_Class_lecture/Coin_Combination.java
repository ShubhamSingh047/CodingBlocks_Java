package Recursion_Class_lecture;

import java.util.*;

public class Coin_Combination {
	public static void main(String[] args) {
		int[] coin= {2,3,5};
		int ammount=8;
		List<Integer> ll=new ArrayList<Integer>();
		List<List<Integer>> ans=new ArrayList<>();
		Combination(coin, ammount, 0,ll,ans);
		System.out.println(ans);
	}
	public static void Combination(int[] coin, int ammount,int idx,List<Integer> ll ,List<List<Integer>> ans) {
		if(ammount==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx; i<coin.length; i++) {
			if(ammount>=coin[i]) {
				ll.add(coin[i]);
				Combination(coin, ammount-coin[i],idx,ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
}
