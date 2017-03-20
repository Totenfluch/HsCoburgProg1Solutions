
public class Main {

	public static void main(String[] args) {
		//a
		for(int x =0; x<=9;x++){
			for(int b =x; b>=0;b--){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//b
		for(int x =9; x>=0;x--){
			for(int b =x; b>=0;b--){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//c
		for(int x =9; x>=0;x--){
			for(int b =9-x; b>=0;b--){
				System.out.print("`");
			}
			for(int n =x; n>=0;n--){
				System.out.print("*");
			}

			System.out.print("\n");
		}

		//d
		for(int x =0; x<=9;x++){
			for(int b =9-x; b>=0;b--){
				System.out.print("`");
			}
			for(int n =x; n>=0;n--){
				System.out.print("*");
			}

			System.out.print("\n");
		}


	}

}
