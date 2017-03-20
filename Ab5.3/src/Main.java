import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte a eingeben:");
		double a = sc.nextDouble();
		System.out.println("Bitte b eingeben:");
		double b = sc.nextDouble();
		System.out.println("Hypotenuse c= "+ Triangle.hypotenuse(a, b));
		sc.close();
	}
}
