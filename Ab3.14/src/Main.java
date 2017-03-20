
public class Main {
	public static void main(String[] args){
		int a,b,c;
		int amount=0;
		for(a=1; a<=500; a++){
			for(b=1; b<=500; b++){
				for(c=1; c<=500; c++){
					if(c*c==a*a+b*b){
						System.out.println("a: " +a + " b: "+b + " c: " +c);
						amount++;
					}
				}
			}
		}
		System.out.println("Es gibt " + amount);
	}
}
