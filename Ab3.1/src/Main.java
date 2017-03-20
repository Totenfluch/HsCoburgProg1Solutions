import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		// Ich mag kein Readline(x) :-(
		
		if(x==0){
			System.out.println(x);
			// 7;
		}else if(x > 2005){
			x = Math.sqrt(x);
		}else{
			x = x*(x+x);
			x = x*x;
			System.out.println(x);
			// 7
		}
		
		sc.close();
	}
}
