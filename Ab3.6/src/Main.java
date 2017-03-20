import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Index n eingeben");
		int index = sc.nextInt();
		int counter=2;
		long lastval = 1;
		long x2lastval = 1;
		long fibo = 1;
		if(index == 0){
			System.out.println("Fibonacci Zahl: f0 = 0");
		}else if(index == 1){
			System.out.println("Fibonacci Zahl: f1 = 1");
		}
		while(counter < index){			
			fibo = lastval + x2lastval;
			x2lastval = fibo-x2lastval;
			lastval = fibo;
			counter++;
			System.out.println(counter + "|" + fibo + "|" + lastval + "|" + x2lastval);
		}
		System.out.println("Fibonacci Zahl: f"+index+ " = " + fibo);
		sc.close();
	}
}
