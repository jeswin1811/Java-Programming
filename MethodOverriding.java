/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Method Overriding
 *    Date: 2024-09-09
 *
 *    Description: This is a java program to implement the concept of method 
 *                 overriding.
 ***********************************************************************************/
import java.util.Scanner;

class Employee1{
	double salary, DA, HRA, salary1;
	Employee1(double salary, double DA, double HRA){
		this.salary = salary;
		this.DA = DA;
		this.HRA = HRA;
	}
	void display() {
		System.out.println("****Employee****");
	}
	void calcSalary() {
		salary1 = salary + salary*(DA/100) + salary*(HRA/100);
		System.out.println("Gross Salary = "+salary1);
	}
}

class Engineer extends Employee1{
	Engineer(double salary, double DA, double HRA){
		super(salary, DA, HRA);
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("****Engineer****");
	}
	void calcSalary() {
		System.out.println("Gross Salary = "+salary1*2);
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		double salary, DA, HRA;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base salary: ");
		salary = input.nextDouble();
		System.out.print("Enter DA: ");
		DA = input.nextDouble();
		System.out.print("Enter HRA: ");
		HRA = input.nextDouble();
		Engineer e = new Engineer(salary, DA, HRA);
		e.display();
		e.calcSalary();
		input.close();
	}
}
