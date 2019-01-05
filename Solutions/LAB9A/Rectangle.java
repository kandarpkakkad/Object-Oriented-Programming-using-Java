package Shape;
public class Rectangle implements Polygon{
	float area;
	float perimeter;
	float length;
	float breath;
	public Rectangle(float len, float bre){
		length = len;
		breath = bre;
	}
	public void calcArea(){
		area = length*breath;
	}
	public void calcPeri(){
		perimeter = 2*(length + breath);
	}
	public void display(){
		System.out.println("Area = " + area + "\nPerimeter = " + perimeter);
	}
}
