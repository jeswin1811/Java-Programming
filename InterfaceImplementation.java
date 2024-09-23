/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Multiple Inheritance Using Interface
 *    Date: 2024-09-23
 *
 *    Description: This is a java program to achieve multiple inheritance by the 
 *                 implementation of 2 interfaces using a class.
 ***********************************************************************************/
import java.util.Scanner;

interface Human{
	final int JobID = 1050;
	void learn(String str);
	void work();
}

interface Recruitment{
	void screening(int score);
}

class Programmer implements Human, Recruitment{
	public void learn(String str) {
		System.out.println("My trained area: " + str);
	}
	public void screening(int score) {
		System.out.println("Test score: " + score);
	}
	public void work() {
		System.out.println("Selected to the Role Development");
	}
}

public class InterfaceImplementation {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Programmer trainee = new Programmer();
		System.out.print("Enter your trained area: ");
		String str = input.nextLine();
		System.out.print("Enter Test Score: ");
		int score = input.nextInt();
		System.out.println("\n----ABOUT MY PLACEMENT----");
		trainee.learn(str);
		trainee.screening(score);
		trainee.work();
		System.out.println("My Job ID is: " + trainee.JobID);
		input.close();
	}
}
