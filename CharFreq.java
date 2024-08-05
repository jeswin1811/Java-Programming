/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: To check the frequency of a character in a string.
 *    Date: 2024-08-05
 *
 *    Description: This is a java program to check the frequency of a character
 *                 in a string.
 ***********************************************************************************/
import java.util.Scanner;
public class CharFreq{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int len, count=0, i=0;
        char ch;
        String str;
        System.out.println("Enter your string: ");
        str = input.nextLine();
        len = str.length();
        System.out.println("Enter the character you want to search: ");
        ch = input.nextLine().charAt(0);
        while(i<len){
            if(str.charAt(i)==ch){
                count++;
            }
            i++;
        } 
    System.out.println("Frequency of "+ch+" is "+count);
    }   
}

