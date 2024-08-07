/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Matrix addition of any 2 matrices.
 *    Date: 2024-08-07
 *
 *    Description: This is a java program to add any 2 matrices.          
 ***********************************************************************************/
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] firstArray = new int[20][20];
        int[][] secondArray = new int[20][20];
        int[][] sum = new int[20][20];
        int i,j,r1,c1,r2,c2;
        System.out.println("Enter the number of rows of first matrix:");
        r1 = input.nextInt();
        System.out.println("Enter the number of columns of first matrix:");
        c1 = input.nextInt();
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
               System.out.println("Enter the elements at position [" + i + "][" + j + "]: ");
               firstArray[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the number of rows of second matrix:");
        r2 = input.nextInt();
        System.out.println("Enter the number of columns of second matrix:");
        c2 = input.nextInt();
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                System.out.println("Enter the elemnts at position ["+ i +"]["+ j +"]");
                secondArray[i][j] = input.nextInt();
            }
        }
        if(r1==r2&&c1==c2){
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    sum[i][j] = firstArray[i][j] + secondArray[i][j];
                }
            }
        }
        else{
            System.out.println("Both matrix dont have the same order hence they cannot be added.");
        }
        System.out.println("The added matrix is:");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }

}

