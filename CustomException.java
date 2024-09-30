import java.util.Scanner;
class AgeException extends Exception{
	public AgeException(String message) {
		super(message);
	}
}

public class CustomException {
	public static void validateAge(int age) throws AgeException{
		if (age<18) {
			throw new AgeException("Age must be at least 18 years old.");
		}
		System.out.println("Eligible to Vote.");
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		try{
			validateAge(age);
		}
		catch(AgeException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			System.out.println("THIS IS INSIDE FINALLY BLOCK");
		}
		input.close();
	}
}
