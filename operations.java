//Programmer : Shrimant More
//Task : Perform Arithematic operations like addition, substraction,multiplication and division

import java.util.Scanner;

class operators
{
  int a,b,c;
  int i;

int ch;

    void method1()
    {
      while(ch<5)
      {
      System.out.println("\n\nHere we will perform arithmetic operations\n");

      System.out.println("Enter your choice\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
      Scanner sc = new Scanner(System.in);
      ch=sc.nextInt();

      switch (ch)
      {

          case 1:
          addition a=new addition();
          a.add();
          break;

          case 2:
          substraction s=new substraction();
          s.sub();

          break;

          case 3:
          multiplication m=new multiplication();
          m.multi();

          break;

          case 4:
          division d=new division();
          d.div();

          break;

          default:
            System.out.println("Please enter valid number\n");

          }   //switch end scope

    }   //while end scope


  } //method1 end scope

} //class end scope

class addition extends operators  //base class
{
  void add()
  {
    System.out.println("In this case we will perform addition operation\n");
    System.out.println("\nEnter 1st number");
    Scanner sc=new Scanner(System.in);

      a=sc.nextInt();

      System.out.println("\nEnter 2nd number");
      b=sc.nextInt();

      c=a+b;

      System.out.println("\nSum of two numbers is -----> "+c);
    }
}

class substraction extends addition  //base class
{
  void sub()
  {
    System.out.println("In this case we will perform substraction operation\n");
    System.out.println("\nEnter 1st number");

      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();

      System.out.println("\nEnter 2nd number");
      b=sc.nextInt();

      c=a-b;

      System.out.println("substraction of two numbers is -----> "+c);

  }
}

class multiplication extends substraction
{
  void multi()
  {
    System.out.println("In this case we will perform multiplication operation\n");
    System.out.println("\nEnter 1st number");

      Scanner sc=new Scanner(System.in);

      a=sc.nextInt();

      System.out.println("\nEnter 2nd number");
      b=sc.nextInt();

      c=a*b;

      System.out.println("multiplication of two numbers is -----> "+c);
  }
}

class division extends multiplication
{
  void div()
  {
    System.out.println("In this case we will perform divide operations\n");
      Scanner sc=new Scanner(System.in);

      System.out.println("\nEnter 1st number");
      a=sc.nextInt();

      System.out.println("\nEnter 2nd number");
      b=sc.nextInt();

      c=a/b;

      System.out.println("Division of two numbers is -----> "+c);

  }
}


class operations
{
  public static void main(String args[])
      {
        operators o=new operators();
        o.method1();
      }
}
