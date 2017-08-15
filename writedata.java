//Programmer : Shrimant More
//Task : Write a string to a file 

import java.io.*;

class writedata
{
  public static void main(String args[])  throws IOException
  {
    File file = new File("myfile.txt");

    file.createNewFile(); //creates New File

FileWriter w = new FileWriter(file);

w.write("hello world");
w.flush();
w.close();

  }
}
