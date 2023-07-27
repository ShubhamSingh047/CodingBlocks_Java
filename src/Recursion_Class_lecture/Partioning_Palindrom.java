package Recursion_Class_lecture;
import java.util.*;

public class Partioning_Palindrom {
	public static void main(String[] args) {
		String str="NitiN";
		List<List<String>> ans=new ArrayList<>();
		List<String> li=new ArrayList<>();
		Partioning(str, li,ans);
		System.out.println(ans);
	}
	public static void Partioning(String str, List<String> li, List<List<String>> ans) {
		if(str.length()==0) {
			ans.add(new ArrayList<>(li));
			return;
		}
		
		for(int i=0; i<str.length(); i++) {
			String s1=str.substring(0,i);
			if(Plaindrom(str)) {
				li.add(s1);
				Partioning(str.substring(i),li,ans);
				li.remove(li.size()-1);
			}
		}
	}
	public static boolean Plaindrom(String str) {
		// TODO Auto-generated method stub
		int i=0;
		int j=str.length()-1;
		while(i>j) {
			if(str.charAt(i)!=str.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
}
