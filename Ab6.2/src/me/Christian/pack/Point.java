package me.Christian.pack;

public class Point {
	private double x;
	private double y;
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	double x(){
		return x;
	}
	
	double y(){
		return y;
	}
	
	public String toString(){
		return "x: " +x + " y: " + y;
	}
}
