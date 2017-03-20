import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz ein: ");
		String satz = sc.nextLine();
		System.out.println("Input: " + satz);


		StringBuffer sb = new StringBuffer(satz);

		int startindex = 0;
		int buffer = 0;
		while(startindex <= sb.length()){
			int firstword = 0;
			System.out.println(startindex + " " + buffer);
			for(int x = startindex+1; x<sb.length(); x++){
				if(sb.charAt(x) == ' '){
					firstword = x;
					buffer = x;
					x=sb.length();
				}else if(x == sb.length()-1){
					break;
				}
			}
			if((firstword-1)%2 != 0)
				firstword--;

			if(startindex+firstword < sb.length())
				for(int i = 1; (i<(firstword/2)-1) && i<sb.length(); i++){
					char first = sb.charAt(startindex+i);
					char secound = sb.charAt(firstword-i);
					sb.setCharAt(startindex+i, secound);
					sb.setCharAt(firstword-i, first);
				}
			else
				break;
			startindex = buffer;
		}
		System.out.println(sb.toString());

		sc.close();

	}

}
