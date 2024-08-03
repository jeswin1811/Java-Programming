/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Print n numbers using while loop.
 *    Date: 2024-08-03
 *
 *    Description: This is a java program to print the first n numbers using a  
 *                 while loop.
 ***********************************************************************************/
import java.util.Scanner;
public class FirstNdigitsUsingWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,i=1;
        System.out.println("How many numbers do u want to print?");
        n = input.nextInt();
        System.out.println("The first "+n+" numbers are: ");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
