class Complex
{
	int real,img;
	Complex()
	{
		real = img = 0;
	}
	Complex(int x)
	{
		real = img = x;
	}
	Complex(int x,int y)
	{
		real = x;
		img = y;
	}

	Complex add(Complex a,Complex b)
	{
		Complex temp = new Complex();
		temp.real = a.real + b.real;
		temp.img = a.img + b.img;
		return (temp);
	}
	Complex sub(Complex a,Complex b)
	{
		Complex temp = new Complex();
		temp.real = a.real - b.real;
		temp.img = a.img - b.img;
		return (temp);
	}
	Complex mul(Complex a,Complex b)
	{
		Complex temp = new Complex();
		temp.real = a.real * b.real;
		temp.img = a.img * b.img;
		return (temp);
	}

	void display()
	{
		System.out.println("Real :"+real+"Img :"+img);
	}
}

public class ComplexDemo
{
	public static void main(String args[])
	{
		Complex c1 = new Complex(10);
		Complex c2 = new Complex(20,30);
		Complex c3 = new Complex();

		c3 = c1.add(c1,c2);
		c3.display();
		c3 = c1.sub(c1,c2);
		c3.display();
		c3 = c1.mul(c1,c2);
		c3.display();
	}
}