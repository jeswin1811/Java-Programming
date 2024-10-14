package matrix;
import java.io.*;
import java.util.*;
public class  MyStringTokenizer {
	public static void main (String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the integers with one space gap:");
			String input = br.readLine();
			StringTokenizer tokenizer = new StringTokenizer(input);
			int sum = 0;
			while(tokenizer.hasMoreTokens()) {
				int num = Integer.parseInt(tokenizer.nextToken()); 
				System.out.println(num);
				sum += num;
			}
			System.out.println("Sum = "+sum);
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
