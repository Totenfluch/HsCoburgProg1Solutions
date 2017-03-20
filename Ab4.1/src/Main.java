
public class Main {
	public static void main(String[] args){
		final int ARRAY_SIZE = 10;
		float[] fractions = new float[ARRAY_SIZE];
		for(int i = 0; i<fractions.length; i++){
			fractions[i] = 0;
		}
		fractions[3] = 4.5f;
		fractions[9] = 5.3f;
		float total=0;
		for(int x=0; x<fractions.length; x++){
			total += fractions[x];
		}
	}
}
