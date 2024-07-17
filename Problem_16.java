package project_euler;

public class Problem_16 {

	public static void main(String[] args) {
		String o = "2";
		String n = "";
		String Temps;
		String f = "1";
		String v = "";
		char tempc;
		int tempi;
		int b = 0;
		int l = 1;
		int h;
		for(int i=1;i<1000;i++) {
			n = "";
			for(int j=0; j<f.length();j++) {
				v = "";
				tempc = o.charAt(o.length()-l);
				l++;
				tempi = Integer.parseInt(""+tempc);
				tempi *=2;
				
				tempi+= b;
				Temps = ""+tempi;
			   	tempi /= 10;
			   	Math.floor(tempi);
			   	b = tempi;
			   	tempc = Temps.charAt(Temps.length()-1);
			   	v = ""+tempc;
			   	n = n+v;
				}
			f = "";
			if(b!=0) {
			   	f = ""+b;
			}
			h = 1;
			for(int j=0; j<n.length();j++) {
				f = f+n.charAt(n.length()-h);
				h++;
			}
			o = f;
			b = 0;
			l = 1;	
		}
		int F = 0;
		char z;
		for(int j=1; j<=f.length();j++) {
			z = f.charAt(f.length()-j);
			F = F+Integer.parseInt(""+z);
		}
		System.out.print(F);
		}
				
	}


