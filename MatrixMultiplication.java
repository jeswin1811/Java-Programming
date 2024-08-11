/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Matrix multiplication of any 2 matrices.
 *    Date: 2024-08-11
 *
 *    Description: This is a java program to multiply any 2 matrices.          
 ***********************************************************************************/
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] a = new int[40][40];
        int[][] b = new int[40][40];
        int[][] c = new int[40][40];
        int i,j,k,r1,c1,r2,c2;
        do{
            System.out.println("Enter the order of first matrix: ");
            System.out.println("Number of rows: ");
            r1 = input.nextInt();
            System.out.println("Number of columns: ");
            c1 = input.nextInt();
            System.out.println("Enter the order of the second matrix: ");
            System.out.println("Number of rows: ");
            r2 = input.nextInt();
            System.out.println("Number of columns: ");
            c2 = input.nextInt();
        }while(c1!=r2);
        System.out.println("Enter the elements of first matrix: ");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.println("Enter the elements at index [" + i + "][" + j + "]");
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                System.out.println("Enter the elements at index [" + i + "][" + j + "]");
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix one is: ");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.print(a[i][j]+"\t");
            }        
            System.out.println();
        }
        System.out.println("Matrix two is: ");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                System.out.print(b[i][j]+"\t");
            }        
            System.out.println();
        }
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                c[i][j] = 0;
                for(k=0;k<c1;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The product of the two matrices is: ");
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    } 
}

