
public class Main {

	public static void main(String[] args) {
		int startindex = 0;
		int checklen = 8;
		String teil1 = "Das haus des nicolaus ist das haus der hexe";
		String teil2 = "Das haus der hexe ist nicht das haus des nicolaus";
		
		teil1 = teil1.toLowerCase();
		teil2 = teil2.toLowerCase();
		
		System.out.println(teil1.regionMatches(true, startindex, teil2, startindex, checklen));
		System.out.println(teil1.substring(startindex, checklen) + " stimmt mit " + teil2.substring(startindex, checklen)+ " überein.");
	}
}
