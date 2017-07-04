//Programmer : Shrimant More
//Task : Employee database

import java.util.Scanner;

class employee
{
 int age;
	 String firstname;
	 String lastname;
	int  exp;	 
	int  salary;

   public static void main(String args[])
   {

	System.out.println("We will store Employee Database\n");
		
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter your firstname");	 
	 String firstname = sc.nextLine();
	
	 System.out.println("Enter your lastname");	
	 String lastname = sc.nextLine();

	 System.out.println("Enter your age");	
	 int age = sc.nextInt();
	
	 System.out.println("Enter your Salary");
	 int salary= sc.nextInt();	
	 
	 System.out.println("Enter your experince\n");
	 int exp = sc.nextInt();

	
		 
	 System.out.println("Your fullname is : "+firstname+lastname);	 

	System.out.println("Your age is : "+age);
	System.out.println("Your Salary is : "+salary);

	System.out.println("Your experince is : "+exp);

   }

}

