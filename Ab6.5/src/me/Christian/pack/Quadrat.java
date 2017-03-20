package me.Christian.pack;

public class Quadrat {

	// Quadrat mit verschiedenen Werten
	int[][] quad; 

	// Klassenmethode zum Erzeugen von magischen Quadraten für ungerade n 
	// falls n gerade liefern Sie null zurück
	public static Quadrat erzeugeMagicQuadrat(int n){

		if(n%2 == 0)
			return null;

		int[][] quad2 = new int[n][n];

		int zeile = n/2;
		int spalte = n/2 + 1;
		int m = 0;

		while(m < (n*n)){
			if(quad2[zeile][spalte] == 0){
				m++;
				quad2[zeile][spalte] = m;
				zeile--;
				spalte++;
				if(zeile == -1){
					zeile = n-1;
				}
				if(spalte == n){
					spalte = 0;
				}
			}else{
				spalte++;
				zeile++;
				if(zeile == n){
					zeile = 0;
				}
				if(spalte == n){
					spalte = 0;
				}
			}
		}
		return new Quadrat(quad2);
	}

	// Konstruktor erzeugt eine quadratische Matrix, die alle Elemente mit 0 initialisiert
	public Quadrat(int n) {
		quad = new int[n][n];
		for(int i=0; i<n; i++){
			for(int x = 0; x<n; x++){
				quad[i][x] = 0;
			}
		}
	}

	// Konstruktor erzeugt eine quadratische Matrix und initiliasiert die Matrix mit den Werten von q
	public Quadrat(int [][] q) {
		quad = q;
	}

	// Liefert die arithmetische Summe für eine Zeile zurück; zeilennr gibt die Zeile an
	public int zeilenSumme(int zeilennr) {
		int val=0;
		for(int i =0; i<quad.length; i++){
			val+=quad[zeilennr][i];
		}

		return val;
	}

	// Liefert die arithmetische Summe für eine Spalte zurück; spaltennr gibt die Spalte an
	public int spaltenSumme(int spaltennr) {
		int val=0;
		for(int i =0; i<quad.length; i++){
			val+=quad[i][spaltennr];
		}

		return val;

	}

	// Liefert die arithmetische Summe der Diagonalen von LinksOben nach RechtsUnten zurück
	public int diagonalSummeOToU() {
		int total3 = 0;
		for(int w = 0; w<quad.length; w++){
			total3 += quad[w][w];
		}
		return total3;
	}

	// Liefert die arithmetische Summe der Diagonalen von LinksUnten nach RechtsOben zurück
	public int diagonalSummeUToO() {
		int total4 = 0;
		for(int w = 0; w<quad.length; w++){
			total4 += quad[w][quad.length-1-w];
		}
		return total4;
	}

	// gibt true zurück, falls das Qudrat ein magisches Quadrat; ansonsten false
	public boolean isMagic() { 
		int total = 0;
		for(int i = 0; i<quad.length; i++){
			total += quad[i][0];
		}
		int total2 = 0;
		int checksum = 0;
		boolean total2test = true;
		for(int xi = 0; xi<quad.length; xi++){
			checksum = total2;
			total2 = 0;
			for(int x = 0; x<quad[xi].length; x++){
				total2 += quad[xi][x];
			}
			if(xi!= 0){
				if(checksum != total){
					//System.out.println(xi+ " "+checksum + " " + total);
					total2test = false;
					break;
				}
			}
		}

		int[] cunique = new int[quad.length*quad.length];
		int o = 0;
		for(int io = 0; io<quad.length; io++){
			for(int iio = 0; iio<quad[io].length; iio++){
				cunique[o] = quad[io][iio];
				o++;
			}
		}
		boolean hasall = true;
		for(int op = 1; op<quad.length*quad.length; op++){
			boolean temp = false;
			for(int xop = 0; xop<cunique.length; xop++){
				if(op == cunique[xop]){
					temp = true;
				}
			}
			if(!temp){
				//System.out.println("Has no: " + op);
				hasall = false;
			}
			temp = false;
		}

		//System.out.println(diagonalSummeOToU() + " " + diagonalSummeUToO() + " " + total2 + " " + total + " " + total2test);
		if((diagonalSummeOToU() == diagonalSummeUToO() && total2 == total) && total2test && hasall){
			return true;
		}else{
			return false;
		}
	}

	// gibt alle aktuellen Werte des Quadrats mit System.out.println aus
	public void print() {
		for(int i = 0; i<quad[0].length; i++){
			for(int x = quad.length-1; x>=0; x--){
				System.out.print(quad[x][i] + " "); 
			}
			System.out.println();
		}
	}


}
