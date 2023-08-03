package Stack;

import java.util.Stack;

public class ReverAStack {
	public static void main(String[] args) {
		Stack<Integer> st= new Stack<>();
		st.push(40);
		st.push(20);
		st.push(30);
		st.push(-10);
		st.push(20);
//		int x=-9;
//		System.out.println(st);
//		Insert(st,x);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	private static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.size()==0)return;
		int x=st.pop();
		Reverse(st);
		Insert(st,x);
	}

	private static void Insert(Stack<Integer> st, int x) {
		// TODO Auto-generated method stub
		if(st.size()==0) {
			st.push(x);
			return;
		}
		int item=st.pop();
		Insert(st,x);
		st.push(item);
	}
	
	
}
