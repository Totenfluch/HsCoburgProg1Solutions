import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		System.out.println("Bitte n eingeben:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long result=1;
		for(int x=n; x>=1; x--){
			result *=x;
		}
		
		System.out.println(result);
		sc.close();
	}
}
