package me.Christian.pack;

public class Main {

	public static void main(String[] args) {
		int[][] a1 = { {2,2,2,2}, {2,2,2,2}, {2,2,2,0},{2,2,2,2}};
		int[][] a2 = { {2,2,2,2}, {2,2,2,2}, {2,2,2,2},{2,2,2,2}};
		int[][] a3 = { {2,7,6}, {9,5,1}, {4,3,8,}};
		int[][] a4 = { {2,3,3,4}, {2,2,5,2}, {5,7,2,2},{4,7,9,2}};
		int[][] a5 = { {1,3,3,1}, {3,2,2,2}, {5,3,3,2},{4,7,9,4}};  
		
		Quadrat q1 = new Quadrat(a1);
		q1.print();
		System.out.println(q1.isMagic());
		
		Quadrat q2 = new Quadrat(a2);
		q2.print();
		System.out.println(q2.isMagic());
		
		Quadrat q3 = new Quadrat(a3);
		q3.print();
		System.out.println(q3.isMagic());
		
		Quadrat q4 = new Quadrat(a4);
		q4.print();
		System.out.println(q4.isMagic());
		
		Quadrat q5 = new Quadrat(a5);
		q5.print();
		System.out.println(q5.isMagic());
		
		Quadrat q6 = new Quadrat(Quadrat.erzeugeMagicQuadrat(9).quad);
		q6.print();
		System.out.println(q6.isMagic());
		
		Quadrat q7 = new Quadrat(Quadrat.erzeugeMagicQuadrat(15).quad);
		q7.print();
		System.out.println(q7.isMagic());
		
	}

}
