class outer
{
	void callmethods()
	{
		B b=new B();
		b.bmethod();
	
		C c=new C();
		c.cmethod();

	}	
	
	class B	///inner class B
	{
		void bmethod()
		{
			System.out.println("this is inner B class\n");	
		}
	}
	
	class C	//inner class C
	{	
		void cmethod()
		{
			System.out.println("This is inner C class\n");
		}
	}
		
}

class innerclassbasic
{
	public static void main(String args[])
	{
		outer o = new outer();
		o.callmethods();		
	}
}
