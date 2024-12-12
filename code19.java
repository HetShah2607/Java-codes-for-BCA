abstract class Calc
{
	abstract double area();
}

class Triangle extends Calc
{
	private double base;
	private double height;

	public Triangle(double x,double y)
	{
		this.base = x;
		this.height = y;
	}

	public double area()
	{
		return 0.5 * base * height;
	}
}
class Rectangle extends Calc
{
	private double length;
	private double width;

	public Rectangle(double x,double y)
	{
		this.length = x;
		this.width = y;
	}

	public double area()
	{
		return length * width;
	}
}

public class code19
{
	public static void main(String args[])
	{
		Triangle t = new Triangle(10,20);
		double area_triangle = t.area();
		System.out.println("Area of t :"+area_triangle);

		Rectangle r = new Rectangle(10,20);
		double area_rec = r.area();
		System.out.println("Area of r :"+area_rec);
	}
}