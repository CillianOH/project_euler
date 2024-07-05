package project_euler;

public class Problem_1 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int a = 0;
		int c = 0;
		int z = 3;
		int v = 5;
		while ( z < 1000){            // checking if the next multiple is less then 10
			int x = i*(3);            // setting x as the next multiple
			i++; 
			int b = a + x;            // letting b temporarily store the addition of all the past additions and the next one
			a = b;                    // Preparing a for next loop
			z = x +(3);               // getting the value of the next multiple
		}
		while (v<1000) {
			int y = j*(5);
			j++;
			 int remainder = y % 3;   //same steps as before but making sure that it wont be a double of one of the multiples of 3 aswell
			if(!(remainder == 0)) {
				int d = c + y;
				c = d;
				v = y +(5);
			}
		}
		int f = c + a;
		System.out.println(f);
	}
}
