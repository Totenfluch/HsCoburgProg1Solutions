import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String splitme = sc.nextLine();
		
		StringTokenizer tokens = new StringTokenizer(splitme);
		while(tokens.hasMoreTokens())
			System.out.println(tokens.nextToken());
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		String[] split = splitme.split(" ");
		for(String s : split)
			System.out.println(s);
		
		sc.close();

	}

}
