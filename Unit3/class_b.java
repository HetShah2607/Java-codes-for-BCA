// code 3 main file

package pack2;

import pack1.class_a;

public class class_b
{
	public static void main(String args[])
	{
		class_a c = new class_a();

		System.out.println("Accesed variable from pack1: "+c.max);
		c.display();
	}
}