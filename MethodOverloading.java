package oopsjava;
/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Area of shapes using method overloading
 *    Date: 2024-07-28
 *
 *    Description: This is a java program to calculate the area of different shapes
 *                 using the concept of method overloading.
 ***********************************************************************************/
import java.util.Scanner;
class Area{
    double CalculateArea(double r){
        return Math.PI*r*r;
    }
    double CalculateArea(double l, double w){
        return l*w;
    }
    double CalculateArea(double b, double h, boolean isTriangle){
        return 0.5*b*h;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double l,w,b,h,r,RectangleArea,CircleArea,TriangleArea;
        Area m = new Area();
        System.out.println("Enter the radius of circle: ");
        r = input.nextDouble();
        CircleArea = m.CalculateArea(r);
        System.out.println("Area of circle = "+CircleArea);
        System.out.println("Enter the length and breadth of rectangle: ");
        l = input.nextDouble();
        w = input.nextDouble();
        RectangleArea = m.CalculateArea(l,w);
        System.out.println("Area of rectangle = "+RectangleArea);
        System.out.println("Enter the base and height of triangle: ");
        b = input.nextDouble();
        h = input.nextDouble();
        TriangleArea = m.CalculateArea(b,h,true);
        System.out.println("Area of triangle = "+TriangleArea);
        input.close();
    }
}
