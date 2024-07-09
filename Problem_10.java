package project_euler;

public class Problem_10 {

	public static void main(String[] args) {
		long i = 2l;
		long r;
		int y = 2;
		long a;
		long b = 0l;
		while(i<2000000) {		
			r = i %y;
			if(r == 0 && i == y) {
				a = i;
				b = b + a;
				if(!(a < 2000000)) {
					i = 2000001;
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
	System.out.print(b);	
	}
}
