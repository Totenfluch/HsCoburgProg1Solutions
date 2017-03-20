import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		String[] article = {" the", " a", " one", " some", " any"};
		String[] noun = {" boy", " girl", " dog", " town", " car"};
		String[] verb = {" drove", " jumped", " ran", " walked", " skipped"};
		String[] preposition = {" to", " from", " over", " under", " on"};
		for(int i = 0; i<=20; i++)
			System.out.println(preposition[r.nextInt(5)] + noun[r.nextInt(5)] + verb[r.nextInt(5)] + preposition[r.nextInt(5)] + article[r.nextInt(5)] + noun[r.nextInt(5)] + "." );
	}

}
