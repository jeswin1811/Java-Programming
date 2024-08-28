package oopsjava;
/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Application of Hierarchical Inheritance
 *    Date: 2024-08-28
 *
 *    Description: This is a java program to read and print the details of officer
 *                 and manager by using the concept of hierarchical inheritance.
 *                 here. (Here 'Employee' being the super class and 'Officer' and
 *                 'Manager' being the sub classes of 'Employee').
 *                 we also make use of constructors and the 'super' keyword in this 
 *                 program.
 ***********************************************************************************/
import java.util.*;
class Employee{
	String name, address;
	int age; 
	long phoneNumber;
	float salary;
	Employee(String name1, String address1, int age1, long phoneNumber1, float salary1 ){
		name = name1;
		address = address1;
		age = age1;
		phoneNumber = phoneNumber1;
		salary = salary1;
	}
	void printEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNumber);
	}
	void printSalary() {
		System.out.println("salary: "+salary);
	}
	
}
class Officer extends Employee{
	String specialization;
	Officer(String name1, int age1, long phoneNumber1, String address1, float salary1, String specialization1){
		super(name1, address1, age1, phoneNumber1, salary1 );
		specialization = specialization1;
	}
	void printSpecialization() {
		System.out.println("Specialization: "+specialization);
	}
}

class Manager extends Employee{
	String department;
	Manager(String name1, int age1, long phoneNumber1, String address1, float salary1, String department1){
		super(name1, address1, age1, phoneNumber1, salary1 );
		department = department1;
	}
	void printDepartment() {
		System.out.println("Department: "+department);
	}
}


public class HierInheritance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, address, specialization, department;
		int age;
		long phoneNumber;
		float salary;
		System.out.println("ENTER THE DETAILS OF OFFICER:");
		System.out.println("Enter Name: ");
		name = input.nextLine();
		System.out.println("Enter Age: ");
		age = input.nextInt();
		System.out.println("Ener Phone Number: ");
		phoneNumber = input.nextLong();
		input.nextLine();
		System.out.println("Enter Address: ");
		address = input.nextLine();
		System.out.println("Enter Salary: ");
		salary = input.nextFloat();
		input.nextLine();
		System.out.println("Enter Specialization: ");
		specialization = input.nextLine();
		
		Officer o = new Officer(name, age, phoneNumber, address, salary, specialization);
		
		System.out.println("ENTER DETAILS OF MANAGER: ");
		System.out.println("Enter Name: ");
		name = input.nextLine();
		System.out.println("Enter Age: ");
		age = input.nextInt();
		System.out.println("Ener Phone Number: ");
		phoneNumber = input.nextLong();
		input.nextLine();
		System.out.println("Enter Address: ");
		address = input.nextLine();
		System.out.println("Enter Salary: ");
		salary = input.nextFloat();
		input.nextLine();
		System.out.println("Enter Department: ");
		department = input.nextLine();		
		
		Manager m = new Manager(name, age, phoneNumber, address, salary, department);
		
		System.out.println("DETAILS OF OFFICER: ");
		System.out.println("===================");
		o.printEmployee();
		o.printSalary();
		o.printSpecialization();
		
		System.out.println();
		
		System.out.println("DETAILS OF MANAGER: ");
		System.out.println("===================");
		m.printEmployee();
		m.printSalary();
		m.printDepartment();
		input.close();
	}
}
