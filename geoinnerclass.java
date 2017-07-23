//Programmer : Shrimant More
//Task : Calculate area of various figures using inner class concept

import java.util.Scanner;

class figure	//Parent class
{
	double pi=3.14;	
	double area;
	double r;
	double arearec;
	double areatri;	
	
	double length;
	double breadth;

	double heigth;
	double base;
			
	void test()
	{
		circle c=new circle();
		c.cir();
	
		rectangle r=new rectangle();	
		r.rec();
		
		triangle t=new triangle();
		t.tri();
	}	
		
	class circle	//Inner class circle
	{
	
		void cir()
		{				
			System.out.println("\n-----Here we will calculate area of circle-----");
			System.out.println("Enter the value of Radius");
			Scanner sc=new Scanner(System.in);
			r=sc.nextDouble();
	
			System.out.println("Value of radius is : "+r);
	
				area=pi*r*r;
		
			System.out.println("\nArea of circle is : "+area);						
		}			
	}	
	
	class rectangle	//Inner class rectangle
	{
	
		void rec()
		{	
			System.out.println("\n-----Here we will calculate area of rectangle-----");
			
 			Scanner sc=new Scanner(System.in);
	
			System.out.println("Enter the value of lenght");			
			length=sc.nextDouble();				

			System.out.println("Value of lenght is : "+length);			
		
			System.out.println("\nEnter the value of Breadth");							
			breadth=sc.nextDouble();

			System.out.println("Value of breadth is : "+breadth);				
			
				arearec=length*breadth;

			System.out.println("Area of rectangle is : "+arearec);		
		}	
	}	

	class triangle		//Inner class triangle 
	{
		void tri()
		{
			System.out.println("\n-----Here we will calculate are of Triangle-----");
				Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of Base");			
			base=sc.nextDouble();				
			System.out.println("Value of base is : "+base);
			
			System.out.println("\nEnter the value of height");			
			heigth=sc.nextDouble();				
			System.out.println("Value of heigth is : "+heigth);
	
			areatri=(heigth*base)/2;
			System.out.println("Area of triangle is : "+areatri);
		}	
	
	}
}


class geoinnerclass
{
	public static void main(String args[])
	{	
		figure fig=new figure();	
		fig.test();	
	}
}
