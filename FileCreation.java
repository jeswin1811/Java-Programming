/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Create a file.		
 *    Date: 2024-10-07
 *
 *    Description: This is a java program to create a new file.
 ***********************************************************************************/
package matrix;
import java.io.*;

public class FileCreation {
	public static void main(String[] args) {
		try {
			File obj1 = new File("Filename2.txt");
			if(obj1.createNewFile()) {
				System.out.println(obj1.getName() + " is created.");
			}
			else {
				System.out.println("File already exists");
			}
			System.out.println(obj1.getAbsolutePath());
		}
		catch(IOException e){
			System.out.println("An error occured..");
			e.printStackTrace();
		}
	}
}
