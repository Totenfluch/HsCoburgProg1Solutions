package me.Christian.pack;

public class Main {
	public static void main(String[] args){
		Triangle t1 = new Triangle(new Point(-1,0), new Point(0,2), new Point(1,0));
		System.out.println(t1.perimeter());
		System.out.println(t1.area());
		
		Triangle t2 = t1;
		t2 = t2.zoomed(new Point(0, -1), -1);
		t2 = t2.moved(0, -1);
		
		System.out.println(t2.lowerLeft());
		System.out.println(t2.upperRight());
	}
}
