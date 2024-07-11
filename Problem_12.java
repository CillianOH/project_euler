package project_euler;

public class Problem_12 {

	public static void main(String[] args) {
		boolean stop = false;
		int t = 0;
		int i = 1;
		int a = 0;
		int j = 1;
		while(stop == false) {
			t = t + i;
			System.out.println(t);
			i++;
			while (j<=t) {
			 int r = t %j;
			 if (r==0) { 
				 a++;
				 if(a==500) {
					 System.out.print("="+t);
					 stop = true;
				 }
				 j++;
			 }
			 else {
				 j++;
			 }
			}
			a = 0;
			j = 1;
		}
	}
}
