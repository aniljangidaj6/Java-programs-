//Programmer : Shrimant More
//Task : Single Inheritance.

class A
{
 void method1()
	{
	System.out.println("Now I'm in ADCET\n");	
	}	
}

class B extends A
{
	void method2()
	{
	System.out.println("Now I'm in LAB\n");	
	}
}

	class inheritance
	{
		public static void main(String args[])
		{	
			B b=new B();
	
			b.method1();
			b.method2();

		}
	}
