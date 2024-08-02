/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Sum and Average of 3 numbers.
 *    Date: 2024-07-27
 *
 *    Description: This is a java program to find the sum and average of three no.s
 *                 without using I/O.
 ***********************************************************************************/

import java.util.Scanner;
 public class sumAvg {
    public static void main(String[] args){
     Scanner obj1 = new Scanner();
        float a=23.24f,b=5.75f,c=23.46f,sum,avg;
        sum = a+b+c;
        avg = sum/3;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}
