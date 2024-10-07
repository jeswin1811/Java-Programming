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
