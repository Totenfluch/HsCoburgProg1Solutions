import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zeilenanzahl angeben:");
		int zeilen = sc.nextInt();
		System.out.println("Bitte Spaltenanzahl eingeben:");
		int spalten = sc.nextInt();
		
		Random randomgen = new Random();
		int[][] matrix = new int[spalten][zeilen];
		for(int n = 0; n< spalten ; n++){
			for(int w = 0 ; w< zeilen; w++){
				matrix[n][w] = randomgen.nextInt(10);
			}
		}
		
		for(int xa = 0; xa < spalten; xa++){
			int total = 0;
			for(int xb = 0; xb < zeilen; xb ++){
				total += matrix[xa][xb];
				System.out.print(matrix[xa][xb] + " ");
			}
			System.out.print(" || " + total);
			System.out.println();
		}
		System.out.println("======================");
		
		for(int np = 0; np < zeilen; np++){
			int total2 = 0;
			for(int pn = 0; pn < spalten; pn++){
				total2 += matrix[pn][np];
			}
			System.out.print(total2 + " ");
		}
	}
}
