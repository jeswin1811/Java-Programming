/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Sum of any 2 numbers.
 *    Date: 2024-07-31
 *
 *    Description: This is a java program to find the sum of any two numbers using  
 *                 I/O.
 ***********************************************************************************/

import java.util.Scanner;
public class SumAvgUsingConsole {
    public static void main(String[] args){
        float a,b,c,sum,average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        sum = a + b  + c;
        average = sum/3;
        System.out.println(a+" + "+b+" + "+c+" = "+sum);
        System.out.println("Average = "+average);
    }
}
