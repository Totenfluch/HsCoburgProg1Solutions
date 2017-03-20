import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int x,y,op;
		Scanner sc = new Scanner(System.in);
		int input;
		int result;
		while(true){
			
			input = 0;
			result = 0;
			x = (int) (Math.random()*33);
			y = (int) (Math.random()*33);
			op = (int) (Math.random()*4);
			while(op==3 && (y==0 || y>x || x%y != 0)){
				y = (int) (Math.random()*33);
			}
			
			System.out.print(x);
			switch(op){
			case 0: System.out.print("+"); result = x+y; break;
			case 1: System.out.print("-"); result = x-y; break;
			case 2: System.out.print("*"); result = x*y; break;
			case 3: System.out.print(":"); result = x/y; break;
			}
			System.out.print(y + "=");
			
			input = sc.nextInt();
			while(input != result){
				System.out.println("Denke nochmals nach!!");
				input = sc.nextInt();
			}
			System.out.println("Wow. Das war richtig");
			System.out.println();
			//sc.close();
		}



	}
}
