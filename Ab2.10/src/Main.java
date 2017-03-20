
public class Main {
	public static void main(String[] args){
		
		// 1
		int i=0;
		i++;
		i = i+1;
		i += 1;
		++i;
		
	
		
		// 2
		int x = 10;
		int y = 20;
		int z = y+x++;;
		System.out.println(z);
		System.out.println(x);
		
		int count = 11;
		if(count > 10){
			System.out.println("Count is greater than 10");
		}
		int total = 111;
		x = --x-total;
		System.out.println(total);
		System.out.println(x);
		
		int q = 50;
		int divisor = 10; 
		q /= divisor;
		System.out.println(q + " " + divisor);
		// ODER
		q = q/divisor;
		System.out.println(q + " " + divisor);
		
		// 3
		x = 5;
		int product = 5;
		int quotient = 5;
		
		product *= x++;
		quotient /= ++x;
		
		System.out.println(product);
		System.out.println(quotient);
		
		
		
		
	}
}
