/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Check wether a string is a palindrome.
 *    Date: 2024-08-04
 *
 *    Description: This is a java program to check wether an entered string is a 
 *                 palindrome or not.
 ***********************************************************************************/
import java.util.Scanner;
public class StringPalindrome{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter your string: ");
        String str = input.nextLine();
        int len = str.length();
        for (int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(str+" is a palindrome.");
        }
        else{
            System.out.println(str+" is not a palindrome.");
        }
    }
}