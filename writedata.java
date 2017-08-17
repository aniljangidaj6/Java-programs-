//Programmer : Shrimant More
<<<<<<< HEAD
//Task : Write a string to a file
=======
//Task : Write a string to a file 
>>>>>>> 772884a5c78a0e1b12d28fc3f40819e0f3a3784e

import java.io.*;

class writedata
{
  public static void main(String args[])  throws IOException
  {
    File file = new File("myfile.txt");

    file.createNewFile(); //creates New File

<<<<<<< HEAD
	FileWriter w = new FileWriter(file);

	w.write("hello world");	
	w.flush();
	w.close();
 }

=======
FileWriter w = new FileWriter(file);

w.write("hello world");
w.flush();
w.close();

  }
>>>>>>> 772884a5c78a0e1b12d28fc3f40819e0f3a3784e
}
