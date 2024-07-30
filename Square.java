/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Square of a number.
 *    Date: 2024-07-30
 *
 *    Description: This is a java program to find square of a number using I/O.
 *                
 ***********************************************************************************/

import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,square;
        System.out.println("Enter your number: ");
        n = input.nextInt();
        square = n * n;
        System.out.println("Square of "+n+" is "+square);
    }
}
