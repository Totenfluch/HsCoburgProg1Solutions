import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte eine Character eingeben: ");
		String checkcharstring = sc.nextLine();
		char checkchar = checkcharstring.charAt(0);
		System.out.println("Eingaben: " + checkchar );
		System.out.println("Bitte geben Sie einen Satz ein: ");
		String checkstring = sc.nextLine();
		System.out.println("Eingabe: " + checkstring);
		
		System.out.println(checkchar  + " gefunden auf Position: " + checkstring.indexOf(checkchar));

		sc.close();
	}

}
