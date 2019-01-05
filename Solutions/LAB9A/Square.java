package Shape;
public class Square implements Polygon{
	float area;
	float perimeter;
	float side;
	public Square(float s){
		side = s;
	}
	public void calcArea(){
		area = side*side;
	}
	public void calcPeri(){
		perimeter = 4*side;
	}
	public void display(){
		System.out.println("Area = " + area + "\nPerimeter = " + perimeter);
	}
}
