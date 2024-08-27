package oopsjava;
/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Constructor Overloading
 *    Date: 2024-08-27
 *
 *    Description: This is a java program to show how constructor overloading can be 
 *                 achieved.
 ***********************************************************************************/
class Operations{
	Operations(double a, double b){
		System.out.println("Sum = "+(a+b));
	}
	Operations(double a, double b, boolean isDiff){
		System.out.println("Difference = " +(a-b));
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Operations m = new Operations(5.43,6.78);
		Operations n = new Operations(6.5,3.5,true);
	}
}
