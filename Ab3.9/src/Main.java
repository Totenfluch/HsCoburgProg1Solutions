import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,e=0,i=0,o=0,u=0,other=0;

		while(true){
			System.out.println("Bitte Satz eingeben");
			a=0;e=0;i=0;o=0;u=0;other=0;
			
			String satz = sc.nextLine();
			satz = satz.toLowerCase();

			for(int x = 0; x< satz.length(); x++){
				char c = satz.charAt(x);
				switch(c){
				case 'a': a++; break;				
				case 'e': e++; break;
				case 'i': i++; break;
				case 'o': o++; break;
				case 'u': u++; break;
				default: other++; break;
				}
			}
			System.out.print("a:"+ a +"\ne:" +e + "\ni:"+i +"\no:"+o+"\nu:"+u+"\nKons. u. Sonderzeiche: "+other+"\n");
			System.out.println("Beenden  (j oder n)");
			String abort = sc.nextLine();
			if(abort.equals("j")){
				sc.close();
				System.exit(0);
			}
		}
	}

}
