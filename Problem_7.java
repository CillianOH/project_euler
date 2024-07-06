package project_euler;

public class Problem_7 {

	public static void main(String[] args) {
		int i = 2;
		int r;
		int t = 0;
		int y = 2;
		while(i<1000000) {
			r = i %y;
			if(r == 0 && i == y) {
				t++;
				if (t==10001) {
					System.out.print(i);
					i = 1000001;
				}
				i++;
				y = 2;
			}
			else if(r==0) {
				i++;
				y = 2;
			}
			else{
				y++;
			}
		}
	}
}