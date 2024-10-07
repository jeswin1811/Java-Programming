package matrix;
import java.io.*;
import java.util.*;
public class ReadFile {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the path: ");
			String path = sc.nextLine();
			BufferedReader input = new BufferedReader(new FileReader(path));
			String line;
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
			sc.close();
		}
		catch(IOException e) {
			System.out.println("An error occurred...");
			e.printStackTrace();
		}
	}

}
