package Recursion_Class_lecture;

public class NcrossMBoard {
	public static void main(String[] args) {
		PrintPath(0,0,3,3,"");
	}
	
	public static void PrintPath(int cr,int cc, int er,int ec, String ans) {
		//cc=current row, cr=current row,ec=end row, er=end row;
		if(cr==er && cc == ec) {
			System.out.println(ans+" ");
			return;
		}
		
		if(cr>er||cc>ec) {
			return;
		}
		
		PrintPath(cr, cc+1, er, ec, ans+"H");
		PrintPath(cr+1, cc, er, ec, ans+"V");
	}
}
