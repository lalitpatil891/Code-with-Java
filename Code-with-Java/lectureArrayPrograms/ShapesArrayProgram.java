package logicalArray.lectureArrayPrograms;

abstract class Shape
{
	public abstract double area();
}

class Square extends Shape
{
	private int side;
	
	public Square(int side)
	{
		super();
		this.side = side;
	}
	
	@Override
	public double area() {
		return side*side;
	}
}

class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}


class Rectangle extends Shape {
	 int length, breadth;
	
	public Rectangle(int length, int breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return this.length* this.breadth;
	}
}
public class ShapesArrayProgram {

	public static void main(String[] args) {
		
		Shape []shapes = new Shape[3];
		
		shapes[0] = new Square(12);
		shapes[1] = new Circle(5);
		shapes[2] = new Rectangle(12,12);
		
		getShapeType(shapes);
	}
	
	public static void getShapeType(Shape []shape )
	{
		for (Shape s : shape)
		{
			System.out.println(s.area());
		}
	}

}
