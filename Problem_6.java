package project_euler;

public class Problem_6 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int h = 0;
		int c = 0;
		while(i<=100) {      
			int x = i;           
			int b = x*x;   
			h = h + b;   
			i++;
		}
		while(j<=100) {
			int y = j;
			c = c+y;   
			j++;
		}
		int g = c*c;   
		int f = g - h; 
		System.out.print(f);
	}
}
