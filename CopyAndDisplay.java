/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: File Handling		
 *    Date: 2024-10-07
 *
 *    Description: This is a java program to create two files, write to the first 
 *		   file and then copy the content from first file to second file
 *		   and then read the copied content from second file through console.
 ***********************************************************************************/
package oopsjava;
import java.io.*;
import java.util.*;
public class CopyAndDisplay {
	public static void main (String[] args) {
		try {
			File obj1 = new File("Sample1.txt");
			File obj2 = new File("Sample2.txt");
			if(obj1.createNewFile()) {
				System.out.println(obj1.getName() + " is created.");
			}
			else {
				System.out.println(obj1.getName()+ " already exists");
			}
			if(obj2.createNewFile()) {
				System.out.println(obj2.getName() + " is created.");
			}
			else {
				System.out.println(obj2.getName() + " already exists");
			}
			System.out.println(obj1.getAbsolutePath());
			System.out.println(obj2.getAbsolutePath());
			
			FileWriter mywriter = new FileWriter("Sample1.txt");
			mywriter.write("Welcome to Java, this line is from Sample1.txt.");
			mywriter.close();
			
			FileInputStream fin = new FileInputStream("Sample1.txt");
			FileOutputStream fout = new FileOutputStream("Sample2.txt");
			
			int i;
			while((i = fin.read()) != -1) {
				fout.write(i);
			}
			System.out.println("Successfully copied the data from Sample1.txt to Sample2.txt");
			fin.close();
			fout.close();
			
			FileReader myreader = new FileReader("Sample2.txt");
			Scanner sc = new Scanner(myreader);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch(IOException e) {
			System.out.println("An error occurred...");
			e.printStackTrace();
		}
	}
}
