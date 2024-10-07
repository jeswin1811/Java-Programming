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
