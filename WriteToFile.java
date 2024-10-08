/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Write contents to a file.	
 *    Date: 2024-10-07
 *
 *    Description: This is a java program to write contents to a file.
 ***********************************************************************************/
package matrix;
import java.io.*;
public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter mywriter = new FileWriter(".txt");
			mywriter.write("Welcome to Java, this line is from Filename1.txt.");
			mywriter.close();
		}
		catch(IOException e) {
			System.out.println("An error occurred...");
			e.printStackTrace();
		}
	}
}
