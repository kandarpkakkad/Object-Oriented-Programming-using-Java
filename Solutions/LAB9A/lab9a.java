package harsh;
import Shape.*;
import java.util.*;
class lab9a{
	public static void main(String args[]){
		float side;
		float length;
		float breath;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter side length of square: ");
		side = scan.nextFloat();
		System.out.print("Enter length of rectangle: ");
		length = scan.nextFloat();
		System.out.print("Enter breath of rectangle: ");
		breath = scan.nextFloat();
		Square s = new Square(side);
		s.calcArea();
		s.calcPeri();
		s.display();
		Rectangle r = new Rectangle(length,breath);
		r.calcArea();
		r.calcPeri();
		r.display();
	}
}
