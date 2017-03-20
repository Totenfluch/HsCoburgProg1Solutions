
public class Main {
	public static void main(String[] args){
		int[] zusortieren = {2000, 2, 45, 34, 100000, 345, 56, 78, 99 ,756,  999, 0, 666, 2345, 7492, 22};
		int temp;
		
		System.out.println("Data items in original order");
		for(int x=0; x<zusortieren.length; x++){
			System.out.print(zusortieren[x] + " ");
		}
		
		
		for(int i=1; i<zusortieren.length; i++) {
			for(int j=0; j<zusortieren.length-i; j++) {
				if(zusortieren[j]>zusortieren[j+1]) {
					temp=zusortieren[j];
					zusortieren[j]=zusortieren[j+1];
					zusortieren[j+1]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("Data items in ascending order");
		for(int x=0; x<zusortieren.length; x++){
			System.out.print(zusortieren[x] + " ");
		}

	}
}
