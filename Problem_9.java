package project_euler;

public class Problem_9 {

	public static void main(String[] args) {
		double z = 1;
		int x;
		int a = 1;
		int b = 1;
		double c = 1;
		while(a<1000) {
			while(z<=1000) {
				x = (a*a) + (b*b);          
				c = Math.sqrt(x);          
				z = a+b+c;                        
				if(z==1000) {               
					System.out.print(a*b*c);
					z = 1001;
					a = 1001;
				}
				b++;
			}
			z=0;
			b=0;
			a++;
		}
	}
}
