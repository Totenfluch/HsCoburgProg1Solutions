
public class Raetsel {
	public static void main(String[] args){
		double a =5;
		int b = 9;
		int d;
		double c;
		int h1=32;
		d=Integer.parseInt(args[0]);
		System.out.println("Input: " + d);
		c = a/b;
		a=d-h1;
		a=a*c;
		System.out.println("Output: "+a);
	}
}
