package project_euler;

public class Problem_14 {

	public static void main(String[] args) {
		long a = 0;
		long f = 0;
		long i=1; 
		long b = 0;
		while(i<1000000) {                  
			i++;
			long j = i;
			a = 0;
			while(j!=1) {                  
				long r = j%2;              
				if(r==0) {               
					j = j/2;
					a++;
				}
				else {                     
					j = (3*j)+1;           
					a++;
				}
			}
			if(b<a) {                      
				b = a;                     
				f =i;
			}
		}
		System.out.println(f);
	}
}
