/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Print n numbers using for loop.
 *    Date: 2024-08-02
 *
 *    Description: This is a java program to print the first n numbers using a  
 *                 for loop.
 ***********************************************************************************/
import java.util.Scanner;
public class FirstNdigitsUsingFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,i;
        System.out.println("How many numbers do u want to print?");
        n = input.nextInt();
        System.out.println("The first "+n+" numbers are: ");
        for (i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
