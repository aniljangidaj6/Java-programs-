interface itsinterface
{
     public void method1();
	public void method2();
}

class interfacebasic implements itsinterface
{
	public void method1()
	{
		System.out.println("This is method 1\n");
	}	
		
	public void method2()
	{
		System.out.println("This is method 2\n");	
	}

	public static void main(String args[])
	{
		 
		interfacebasic ib =new interfacebasic();

		ib.method1();	
		ib.method2();	
		
	}	

}


