package me.Christian.pack;

public class Triangle {
	private Point a, b, c;
	public Triangle(Point a, Point b, Point c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	Point getA(){
		return a;
	}
	
	Point getB(){
		return b;
	}
	
	Point getC(){
		return c;
	}
	
	double perimeter(){
		double part11 = Math.abs(a.x()-b.x());
		double part12 = Math.abs(a.y()-b.y());
		double ab = Math.sqrt(Math.pow(part11, 2) + Math.pow(part12, 2));
		
		double part21 = Math.abs(a.x()-c.x());
		double part22 = Math.abs(a.y()-c.y());
		double ac = Math.sqrt(Math.pow(part21, 2) + Math.pow(part22, 2));
		
		double part31 = Math.abs(b.x()-c.x());
		double part32 = Math.abs(b.y()-c.y());
		double bc = Math.sqrt(Math.pow(part31, 2) + Math.pow(part32, 2));
		
		return ab+ac+bc;
	}
	
	double area(){
		double x1 = b.x()-a.x();
		double y2 = c.y()-a.y();
		double y1 = b.y()-a.y();
		double x2 = c.x()-a.x();
		return 1.0/2*(Math.abs(x1*y2-y1*x2));
	}
	
	Point lowerLeft(){
		double leftx;
		if(a.x() <= c.x() && a.x() <= b.x()){
			leftx = a.x();
		}else if(b.x() <= c.x() && b.x() <= a.x()){
			leftx = b.x();
		}else{
			leftx = c.x();
		}
		
		double lefty;
		if(a.y() <= c.y() && a.y() <= b.y()){
			lefty = a.y();
		}else if(b.y() <= c.y() && b.y() <= a.y()){
			lefty = b.y();
		}else{
			lefty = c.y();
		}
		
		return new Point(leftx, lefty);
	}
	
	Point upperRight(){
		double rightx;
		if(a.x() >= c.x() && a.x() >= b.x()){
			rightx = a.x();
		}else if(b.x() >= c.x() && b.x() >= a.x()){
			rightx = b.x();
		}else{
			rightx = c.x();
		}
		
		double righty;
		if(a.y() >= c.y() && a.y() >= b.y()){
			righty = a.y();
		}else if(b.y() >= c.y() && b.y() >= a.y()){
			righty = b.y();
		}else{
			righty = c.y();
		}
		
		return new Point(rightx, righty);
	}
	
	Triangle moved(double dx, double dy){
		Point dp1 = new Point(a.x()+dx, a.y()+dy);
		Point dp2 = new Point(b.x()+dx, b.y()+dy);
		Point dp3 = new Point(c.x()+dx, c.y()+dy);
		return new Triangle(dp1, dp2, dp3);
	}
	
	Triangle zoomed(double f){
		Point dp1 = new Point(a.x()*f, a.y()*f);
		Point dp2 = new Point(b.x()*f, b.y()*f);
		Point dp3 = new Point(c.x()*f, c.y()*f);
		return new Triangle(dp1, dp2, dp3);
	}
	
	Triangle zoomed(Point p, double f){
		double amx = lowerLeft().x();
		double amy = lowerLeft().y();
		//System.out.println(amx + " aaa " + amy);
		Triangle z = moved(-amx, amy);
		//System.out.println(z.lowerLeft().x() + " llf " + z.lowerLeft().y());
		//System.out.println(z.getB().x() + " bb "+ z.getB().y());
		z = z.zoomed(f);
		//System.out.println(z.getB().x() + " bbb " + z.getB().y());
		z = z.moved(-amx, -amy);
		
		
		return this;
	}
}
