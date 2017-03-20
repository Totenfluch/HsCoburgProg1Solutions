import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte 1. Würfelzahl eingeben");
		
		int zahl1 = sc.nextInt();
		
		System.out.println("Bitte 2. Würfelzahl eingeben");
		int zahl2 = sc.nextInt();
		
		if((zahl1 == 1 && zahl2 == 2) ||(zahl1 == 2 && zahl2 == 1)){
			System.out.println("1000");
		}else if(zahl1 == zahl2){
			System.out.println(100*zahl1);
		}else{
			if(zahl1>zahl2){
				System.out.println(10*zahl1+zahl2);
			}else{
				System.out.println(10*zahl2+zahl1);
			}
		}
		
		
		sc.close();
		

	}

}
