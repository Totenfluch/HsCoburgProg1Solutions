import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Anzahl der Zahlen:");
		int maxcount = sc.nextInt();
		int counter = 1;
		System.out.println("Bitte Zahl eingeben:");
		int temp = sc.nextInt();
		int low = temp;
		while(maxcount > counter){
			System.out.println("Bitte Zahl eingeben:");
			temp = sc.nextInt();
			
			if(temp < low){
				low = temp;
			}
			counter++;
		}
		System.out.println("Minimum: "+low);
		sc.close();
	}

}
