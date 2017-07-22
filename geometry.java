//Programmer : Shrimant More
//Task : Find Area and Circumference of the circle

import java.util.Scanner;

class members
{
  Double area,circumference;
  int r;

}

class area extends members
{
  void method2()
  {
    Double pi=3.14;
    

	System.out.println("\nWe will calculate area of the circle");

    	System.out.println("Enter the radius of the circle");

     	Scanner sc=new Scanner(System.in);
    		r=sc.nextInt();

      area=pi*r*r;
    	
	System.out.println("\nArea of circle is : "+area);
  }
}

class circumference extends members
{
  void method3()
  {
    Double pi=3.14;
    
	System.out.println("\n\nWe will calculate circumference of the circle");

     System.out.println("Enter the radius of the circle");

    		Scanner sc=new Scanner(System.in);
    		r=sc.nextInt();
    
    circumference=2*pi*r;

    System.out.println("\ncircumference of the cirlce is : "+circumference);
  }
}

class geometry
{
  public static void main(String args[])
  {
       area a=new area();
       a.method2();

       circumference c=new circumference();
       c.method3();

  }

}
