import java.util.Random;

public class Main {
	public static void main(String[] args){
		Random r = new Random();
		String[] firstnames = {"Peter", "Sciller", "Max", "Walde", "TekToniiik", "Physicus", "Lyzor", "Totenfluch", "Panda", "xCrone"};
		String[] lastnames = {"Walt", "Grey", "Stonem", "Stark", "Winter", "Summer", "Leigh", "Meyer", "Merkel", "Busch", "Texas"};
		for(int i = 0; i<15; i++){
			Employee x = new Employee(firstnames[r.nextInt(firstnames.length-1)], lastnames[r.nextInt(lastnames.length-1)]);
			System.out.println(x.toString());
		}
			
	}
}
