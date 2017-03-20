import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x,y,z;
		
		System.out.println("Bitte x eingeben");
		x = sc.nextDouble();
		
		System.out.println("Bitte y eingeben");
		y = sc.nextDouble();
		
		z = x*x*y*y - 4*x*y + 4;
		System.out.println("1) " + z);
		
		z = ((1+x*y)*(1+x*y) / (1+Math.pow(1+x*y, 4)));
		System.out.println("2) " + z);
		
		z = x*y+(3-x)*y-y;
		System.out.println("3) " + z);
		
		z = 2*y;
		System.out.println("4) " + z);
		
		sc.close();
		
	}
}
