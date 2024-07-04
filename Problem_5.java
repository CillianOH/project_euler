package project_euler;

public class Problem_5 {

	public static void main(String[] args) {
		int f;
		int a = 1;
		for(int i=0; i<300000000; i++) {   //Repeating loop
			for (int j = 1; j<21; j++) {   //Repeating all divisors up to 20
				int r = a%j;               //Getting Remainders of divisors
				if(j==20 && r==0){         //if all numbers up to 20 divided evenly
					f = a;
					System.out.print(f);   //Print answer
					j = 21;
					i = 300000001;         //escape
				}
				else if(r!=0) {            //Skipping numbers that don't divide evenly
					j = 22;
				}
			}
			a++;
		}
	}
}
