package matrix;
import java.io.*;
public class UserReadDisplay {
	public static void main(String[] args) {
		try {
			File obj3 = new File("Register1.txt");
			if(obj3.createNewFile()) {
				System.out.println(obj3.getName()+" is created");
			}
			else {
				System.out.println(obj3.getName()+" already exists");
			}
			System.out.println("File path: "+obj3.getAbsolutePath());
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			FileWriter writer = new FileWriter("Register1.txt");
			System.out.println("Enter your KEAM rank: ");
			writer.write(input.readLine());
			input.close();
			writer.close();
			BufferedReader br = new BufferedReader(new FileReader("Register1.txt"));
			String line;
			while((line=br.readLine()) != null) {
				System.out.println("Reading from 'Register1.txt'");
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e){
			System.out.println("An error occured: "+e.getMessage());
		}
	}
}
