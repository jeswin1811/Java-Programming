package matrix;
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
			String line;
			while((line=sc.nextLine()) != null) {
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
