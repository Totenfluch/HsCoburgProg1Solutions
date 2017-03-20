import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n=0,m=0;
		double x,y;
		double a0=1.0, a1=2.5, a2=0.1, a3=0.0, a4=0.8, a5=0.0, a6=1.5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte n eingeben:");
		n = sc.nextInt();
		System.out.println("Bitte m eingeben:");
		m = sc.nextInt();
		System.out.println("Bitte x eingeben:");
		x = sc.nextDouble();
		
		y = Math.log(Math.abs(n-m)*x);
		System.out.println("1) " + y);
		
		y = Math.sin(((((double)n+m)/2)*x))-Math.cos(((((double)n-m)/2)*x));
		System.out.println("2) " + y);
		
		y = 1/2*((((double)n-m)/(n+m))/2)*x*Math.exp((-((double)n+m))*Math.pow(x, 2));
		System.out.println("3) " + y);
		
		y = a0+x*(-a1+x*(a2+x*(-a3+x*(a4+x)*(-a5+x*(a6)))));
		System.out.println("4) " + y);
		
		y = ( ((Math.exp(x)+x)*(Math.exp(x)+x))/((1.0/2*x)+Math.exp(x)) ) - Math.exp(x);
		System.out.println("5) " + y);
		
		sc.close();
		
	}
	
	
}
