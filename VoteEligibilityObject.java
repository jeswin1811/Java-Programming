package oopsjava;
/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Vote ELigibility using object.
 *    Date: 2024-07-28
 *
 *    Description: This is a java program to check whether a person is eligible to 
 *                 vote by creating an object.
 ***********************************************************************************/
import java.util.Scanner;
class Vote{
	int age;
	Scanner input = new Scanner(System.in);
	void Test() {
		System.out.println("Enter your age: ");
		age = input.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote.");
		}
		else if(age<18&&age>0) {
			System.out.println("You are not eligible to vote.");
		}
		else System.out.println("INVALID INPUT");
	}
}
public class VoteEligibilityObject {
	public static void main(String[] args) {
		Vote obj = new Vote();
		obj.Test();
	}
}
