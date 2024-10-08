/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Exception Handling
 *    Date: 2024-10-07
 *
 *    Description: This is a java program to implement exception handling using try-
 *                 catch-finally.
 ***********************************************************************************/
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char confirmation;
        do {
            System.out.println("Choose your operation:");
            System.out.println("1. Arithmetic operation");
            System.out.println("2. Array index access");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter number to divide: ");
                        int num1 = input.nextInt();
                        System.out.print("Enter the divisor: ");
                        int num2 = input.nextInt();
                        int result = num1 / num2;
                        System.out.println("Result = " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    } finally {
                        System.out.println("INSIDE THE FINALLY BLOCK");
                    }
                    break;
                case 2:
                    try {
                        int[] arr = {1, 2, 3, 4, 5, 6, 7};
                        System.out.print("Enter the index you want to access: ");
                        int index = input.nextInt();
                        System.out.println("The element at index " + index + " is " + arr[index]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    } finally {
                        System.out.println("INSIDE THE FINALLY BLOCK");
                    }
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
            System.out.print("Do you want to continue? (Y or N) ");
            input.nextLine();
            confirmation = input.nextLine().charAt(0);
        } while (confirmation == 'y' || confirmation == 'Y');
        
        input.close(); 
    }
}
