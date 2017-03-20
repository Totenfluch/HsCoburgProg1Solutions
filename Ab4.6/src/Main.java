import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = -1;
		while(n >= 10 || n <= 2  || n%2 == 0){
			System.out.println("Bitte geben Sie n ein: ");
			n = sc.nextInt();
		}

		int[][] quad = new int[n][n];

		int zeile = n/2;
		int spalte = n/2 + 1;
		int m = 0;

		while(m < (n*n)){
			if(quad[zeile][spalte] == 0){
				m++;
				quad[zeile][spalte] = m;
				zeile--;
				spalte++;
				if(zeile == -1){
					zeile = n-1;
				}
				if(spalte == n){
					spalte = 0;
				}
			}else{
				spalte++;
				zeile++;
				if(zeile == n){
					zeile = 0;
				}
				if(spalte == n){
					spalte = 0;
				}
			}
		}
		
		for(int i = 0; i<n; i++){
			for(int x = n-1; x>=0; x--){
				System.out.print(quad[x][i] + " "); 
			}
			System.out.println();
		}
		sc.close();
		
		// CHECK IT
		int total = 0;
		for(int i = 0; i<n; i++){
			total += quad[i][0];
		}
		int total2 = 0;
		for(int x = 0; x<n; x++){
			total2 += quad[3][x];
		}
		int total3 = 0;
		for(int w = 0; w<n; w++){
			total3 += quad[w][w];
		}
		System.out.println(total + " " + total2 + " " + total3);
		if(total == total2 && total2 == total3 && total == total3){
			System.out.println("Das Programm funktioniert");
		}else{
			System.out.println("Da war wohl wieder ein noob am werk");
		}
		
		
	}
}
