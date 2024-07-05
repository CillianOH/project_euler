package project_euler;

public class Problem_4 {

	public static void main(String[] args) {
		int  y = 1;
		int x = 1;
		int z;
		int a = 1;
		while(y<1000) {
			while(x<1000) {                 //cycles through all multiples of numbers under 1000
				z = x*y;                    //gets the product
				int h = z;                  //h = original number
				int f = 0;                  //f = reversed
				while( z != 0) {            //repeats while z doesn't equal zero
					int v = z %10;          //gets the remainder of z / 10
					f = f * 10 +v;          //sets the reverse as the previous reverse multiplied by 10 plus the remainder
					z /=10;			        //divides z by 10 and assigns the answer to z
				}                           //this in turn cycles through slowly building up the palindrome and storing it as f
				if(h == f) {                //checking to see if it is a palindrome
					if(a < h) {             //if this number is bigger then any previous ones it will become a
						a = h;
					}
				}
				x++;
			}
			x = 1;
			y++;
		}
		System.out.print(a);		
	}
}
