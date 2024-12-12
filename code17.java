import java.io.*;

abstract class Vehicle
{
	abstract void numWheels();
	String vname;
	int num_wheel;
}

class Car extends Vehicle
{
	public Car(String str,int n)
	{
		this.vname = str;
		this.num_wheel = n;
	}

	public void numWheels()
	{
		System.out.println("Vehicle name:"+vname);
		System.out.println("Vehicle whhels:"+num_wheel);
	}
}

class Truck extends Vehicle
{
	public Truck(String str,int n)
	{
		this.vname = str;
		this.num_wheel = n;
	}

	public void numWheels()
	{
		System.out.println("Vehicle name:"+vname);
		System.out.println("Vehicle whhels:"+num_wheel);
	}
}

public class code17
{
	public static void main(String args[])
	{
		Car c = new Car("Car",4);
		c.numWheels();

		Truck t = new Truck("Truck",16);
		t.numWheels();
	}
}