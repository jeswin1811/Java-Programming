/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Check wether a number is a palindrome.
 *    Date: 2024-08-01
 *
 *    Description: This is a java program to check wether a number is palindrome 
 *                 or not.
 ***********************************************************************************/

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        int i=0,n,r,s=0,og;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n = input.nextInt();
        og=n;
        while(i<n){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(og==s){
            System.out.println(og+" is a palindrome.");
        }
        else System.out.println(og+ " is not a palindrome.");
    }
    
}
