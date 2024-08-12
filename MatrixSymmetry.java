/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Matrix Symmetry.
 *    Date: 2024-08-12
 *
 *    Description: This is a java program to check wether a given matrix is 
 *                 symmetric or not.        
 ***********************************************************************************/
import java.util.Scanner;
public class MatrixSymmetry{
    public static void main(String[] args) {
        int[][] matrix = new int[40][40];
        int[][] transpose = new int[40][40];
        Scanner input = new Scanner(System.in);
        int i,j,r,c;
        System.out.println("Enter the order: ");
        System.out.println("Number of rows: ");
        r = input.nextInt();
        System.out.println("Number of columns: ");
        c = input.nextInt();
        if(r!=c){
            System.out.println("The matrix is not symmetric.");
            return;
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.println("Enter the element at position [" + i + "][" + j + "]");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The given matrix is: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("The transpose is: ");
        for(i=0;i<r;i++){   
            for(j=0;j<c;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
        boolean symmetric = true;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(matrix[i][j]!=transpose[i][j]){
                    symmetric = false;
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("The given matrix is symmetric.");
        }
        if(!symmetric){
            System.out.println("The given matrix is not symmetric.");
        }
    }      
}
