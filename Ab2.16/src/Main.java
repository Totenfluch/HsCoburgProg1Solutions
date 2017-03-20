import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		boolean result;
		while(true){
			System.out.println("Bitte a eingeben:");
			a = sc.nextInt();
			System.out.println("Bitte b eingeben:");
			b = sc.nextInt();
			System.out.println("Bitte c eingeben:");
			c = sc.nextInt();
			System.out.println("Bitte d eingeben:");
			d = sc.nextInt();

			boolean result2,result3,result4;

			// Mindestens eine Variable 1
			if(a>1 || b>1 || c>1 || d>1){
				result = true;
			}else{
				result = false;
			}

			// min 1 max 3 variablen 1
			int helpme=0;
			if(a>1){
				helpme++;
			}
			if(b>1){
				helpme++;
			}
			if(c>1){
				helpme++;
			}
			if(d>1){
				helpme++;
			}
			if(helpme <4 && helpme>0){
				result2 = true;
			}else{
				result2 = false;
			}


			// genau eine variable <0
			/*if(a<0 ^ b<0 ^ c<0 ^ d<0){
				result3 = true;
			}else{
				result3 = false;
			}*/
			int helpme2=0;
			if(a<0){helpme2++;}
			if(b<0){helpme2++;}
			if(c<0){helpme2++;}
			if(d<0){helpme2++;}
			if(helpme2==1){
				result3=true;
			}else{
				result3 = false;
			}
			// alle die >0 >10
			if(((a > 0 && a >10) || (a<=0)) && ((b > 0 && b >10) || (b<=0)) && ((c > 0 && c >10) || (c<=0)) && ((d > 0 && d >10) || (d<=0)) ){
				result4 = true;
			}else{
				result4 = false;
			}

			System.out.println(a+" "+b+" "+c+" "+d+ " | "+result+ " | "+result2+ " | "+result3+ " | "+result4);
			System.out.println("---------------------------------------------");
		}
	}
}
