import java.util.*;
class Circle{
	double pi = 3.14;
	double radius;
	String color;
	Circle(){
		radius = 0;
		color = "";
	}
	Circle(double radius){
		this.radius = radius;
	}
	double getRadius(){
		return radius;
	}
	double getArea(){
		return pi*radius*radius;
	}
}

class Cylinder extends Circle{
	double height;
	Cylinder(){
		super();
		height = 0;
	}
	Cylinder(double radius){
		super(radius);
	}
	Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	double getHeight(){
		return height;
	}
	double getArea(){
		return 2*pi*radius*height;
	}
	double getVolume(){
		return pi*radius*radius*height;
	}
}

class lab9b{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		char c;
		do{
			double r = scan.nextDouble();
			double h = scan.nextDouble();
			String col = scan.next();
			Cylinder c1 = new Cylinder(r,h);
			System.out.println("Radius: " + c1.getRadius() + "\nHeight: " + c1.getHeight() + "\nColor: " + col + "\nArea of cylinder: " + c1.getArea() + "\nVolume of cylinder: " + c1.getVolume());
			System.out.println("Do you want to continue?\nY for yes and N for no: ");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
