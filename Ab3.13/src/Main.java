
public class Main {
	public static void main(String[] args){
		double pi=4;
		boolean change=true;
		int berechnung=0;
		String sum = "";
		for(double x=3; !sum.startsWith("3.14159"); x+=2){
			if(change){
				pi-=(4.0/x);
				change = !change;
			}else{
				pi+=(4.0/x);
				change = !change;
			}
			sum = String.valueOf(pi);
			berechnung+=2;
			
		}
		System.out.println(pi + " | Berechnungen: " + (berechnung-1));
		
		pi=4;
		change=true;
		berechnung=0;
		sum = "";
		int x = 3;
		do{
			if(change){
				pi-=(4.0/x);
				change = !change;
			}else{
				pi+=(4.0/x);
				change = !change;
			}
			sum = String.valueOf(pi);
			berechnung+=2;
			x+=2;
		}while(!sum.startsWith("3.14159"));
		System.out.println(pi + " | Berechnungen: " + (berechnung-1));
	}
	
	// a-> 117 ; 234
	// b-> 1686  ; 3372
	// c-> 10792 ; 21584
	// d-> 136119 ; 272238
}
