/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: FileWriter and FileReader class		
 *    Date: 2024-10-14
 *
 *    Description: Write a Java program that reads a line of integers, and then 
 *		   displays each integer, and the sum of all the integers 
 *                  (Use String Tokenizer class of java.util).
 ***********************************************************************************/
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
