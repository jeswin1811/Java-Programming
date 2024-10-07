package matrix;
import java.io.*;

public class CopyFile {
	public static void main (String[] args) {
		try {
			FileInputStream fin = new FileInputStream("Filename1.txt");
			FileOutputStream fout = new FileOutputStream("Filename2.txt");
			int i;
			while((i = fin.read()) != -1) {
				fout.write(i);
			}
			System.out.println("Successfully copied the data from Filename1.txt to Filename2.txt");
			fin.close();
			fout.close();
		}
		catch(IOException e) {
			System.out.println("An error occurred...");
			e.printStackTrace();
		}
	}
}
