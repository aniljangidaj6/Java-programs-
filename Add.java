//Programmer : Shrimant More
//Task : Add two numbers

import java.util.Scanner;

class operation
{
  int a,b,c;

  void method()
  {

    Scanner sc=new Scanner(System.in);

    System.out.println("We will perform addition operation\n");
    
		System.out.println("Enter first number\n");
		a=sc.nextInt();
		
	    	System.out.println("Enter second number\n");
		b=sc.nextInt();

  }

      void add()
      {
          c=a+b;
          System.out.println("Sum of two numbers is : "+c);
      }

}


class Add
{
  public static void main(String args[])
  {
    operation o=new operation();
    o.method();
    o.add();

  }

}
