import java.util.Scanner;

public class DreierSumme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n eingeben:");
		int n = sc.nextInt();
		int summe = 0;
		if(n<3){
			System.out.println("summe = 0");
		}else{
			while(n%3 != 0){
				n--;
			}
			System.out.println(n);
			System.out.print("For-Schleife:\n3 ");
			for(int x =3; x<=n; x+=3){
				if(x!=3){
					System.out.print(" + " + x);
				}
				summe +=x;
			}
			System.out.println();
			System.out.println("summe = " + summe);
			summe=0;
			
			
			
			
			System.out.println();
			System.out.print("While-Schleife:\n3 ");
			int x = 3;
			while(x<=n){
				if(x!=3){
					System.out.print(" + " +x);
				}
				summe+=x;
				x+=3;
			}
			System.out.println();
			System.out.println("summe = " + summe);
			summe=0;
			
			
			
			
			System.out.println();
			System.out.print("Do-While-Schleife:\n3 ");
			x = 3;
			do{
				if(x!=3){
					System.out.print(" + " +x);
				}
				summe+=x;
				x+=3;
			}while(x<=n);
			System.out.println();
			System.out.println("summe = " + summe);
			summe=0;
		}

		sc.close();

	} 

}
