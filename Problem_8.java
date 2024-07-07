package project_euler;

public class Problem_8 {

	public static void main(String[] args) {
		String number = "73167176531330624919225119674426574742355349194934"
					  + "96983520312774506326239578318016984801869478851843"
					  + "85861560789112949495459501737958331952853208805511"
					  + "12540698747158523863050715693290963295227443043557"
				 	  + "66896648950445244523161731856403098711121722383113"
				 	  + "62229893423380308135336276614282806444486645238749"
				 	  + "30358907296290491560440772390713810515859307960866"
				 	  + "70172427121883998797908792274921901699720888093776"
					  + "65727333001053367881220235421809751254540594752243"
					  + "52584907711670556013604839586446706324415722155397"
					  + "53697817977846174064955149290862569321978468622482"
					  + "83972241375657056057490261407972968652414535100474"
					  + "82166370484403199890008895243450658541227588666881"
					  + "16427171479924442928230863465674813919123162824586"
					  + "17866458359124566529476545682848912883142607690042"
					  + "24219022671055626321111109370544217506941658960408"
					  + "07198403850962455444362981230987879927244284909188"
					  + "84580156166097919133875499200524063689912560717606"
					  + "05886116467109405077541002256983155200055935729725"
					  + "71636269561882670428252483600823257530420752963450";
		int index2=1;int index3=2;int index4=3;int index5=4;int index6=5;int index7=6;int index8=7;int index9=8;int index10=9;int index11=10;int index12=11;int index13=12;
		long x = 1;
		long y = 0;
		for (int i = 0; i<988;) {
		char a = number.charAt(i);                
		char b = number.charAt(index2);
		char c = number.charAt(index3);
		char d = number.charAt(index4);
		char e = number.charAt(index5);
		char f = number.charAt(index6);
		char g = number.charAt(index7);
		char h = number.charAt(index8);
		char z = number.charAt(index9);
		char j = number.charAt(index10);
		char k = number.charAt(index11);
		char l = number.charAt(index12);
		char m = number.charAt(index13);
		long A = Character.getNumericValue(a);     
		long B = Character.getNumericValue(b);
		long C = Character.getNumericValue(c);
		long D = Character.getNumericValue(d);
		long E = Character.getNumericValue(e);
		long F = Character.getNumericValue(f);
		long G = Character.getNumericValue(g);
		long H = Character.getNumericValue(h);
		long Z = Character.getNumericValue(z);
		long J = Character.getNumericValue(j);
		long K = Character.getNumericValue(k);
		long L = Character.getNumericValue(l);
		long M = Character.getNumericValue(m);
		x = A*B*C*D*E*F*G*H*Z*J*K*L*M;          
		i++;index2++;index3++;index4++;index5++;index6++;index7++;index8++;index9++;index10++;index11++;index12++;index13++;
		if(y<x) {                               
			y = x;	
		}
		}
		System.out.println(y);
	}
}
