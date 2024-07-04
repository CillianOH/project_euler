package project_euler;

public class Problem_2 {

	public static void main(String[] args) {	
		int a = 1;
		int b = 2;
		int c;
		int y = 0;
		while(a<4000000) {			
			c = a + b;           //preparing the fibonacci sequence
			a = b;
			b = c;
			int remainder = a%2;      //Finding if the number is even
			if (remainder == 0) {
				int x = y + a;        //adding all the even numbers
				y = x;
			}
		}
		System.out.print(y);
	}
}
