package project_euler;

public class Problem_3 {

	public static void main(String[] args) {
		Long Input = 600851475143l;
		long b = 2;
		long y = 2;
		long r;	
		while(b <= Input) {
			long v = b %y;                 //Getting the remainder
			if(v == 0 && y == b) {	       // if it is a prime number 
				r = Input %b;              //remainder of prime and input
				if (r == 0) {              //if the prime number divides
					System.out.print("["+b+"]");  
					Input = Input / b;     // getting the other factor for division again
				}	
				b++;                       //moving on to check if next number is prime
				y = 2;                     //reseting
			}
			else if(v == 0) {              //If it isn't a prime number it will move to next
				b++ ;
				y =2;
			}
			else {                         //Continuing the cycle until it finds a factor
				y++;
			}
		}
	}
}

					


