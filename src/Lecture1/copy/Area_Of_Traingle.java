package Lecture1.copy;

public class Area_Of_Traingle {
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=5;
		int s=(a+b+c)/2;
		int area = (int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
	}

}
