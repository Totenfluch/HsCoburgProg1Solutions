
public class Main {
	public static void main(String[] args){
		int primzahlen=0;
		for(int i = 1; i<=1000; i++){
			boolean isprim=true;
			for(int helper=2; helper <= i/2; helper++){
				if(i%helper == 0){
					isprim=false;
					break;
				}
			}
			if(isprim){
				System.out.println(i + " ist primzahl");
				primzahlen++;
			}
			
		}
		System.out.println("Es gibt " + primzahlen + " Primzahlen im Bereich 1-1000");
	}
}
