abstract class Vegatable
{
	protected String color;

	public Vegatable(String color)
	{
		this.color = color;
	}

	abstract public String getName();

	public String toString()
	{
		return getName() + "( Color : "+color+" )";
	}
}

class Cabagge extends Vegatable
{
	public Cabagge(String color)
	{
		super(color);
	}

	public String getName()
	{
		return "Cabagge";
	}
}
class Carrot extends Vegatable
{
	public Carrot(String color)
	{
		super(color);
	}

	public String getName()
	{
		return "Carrot";
	}
}
class Potato extends Vegatable
{
	public Potato(String color)
	{
		super(color);
	}

	public String getName()
	{
		return "Potato";
	}
}

public class code20
{
	public static void main(String args[])
	{
		Cabagge c1 = new Cabagge("Green");
		Carrot c2 = new Carrot("Red");
		Potato p1 = new Potato("Brown");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(p1);
	}
}

