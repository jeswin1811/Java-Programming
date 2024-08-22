package oopsjava;
/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Single Inheritance
 *    Date: 2024-08-22
 *
 *    Description: This is a java program to show how single inheritance can be 
 *                 achieved.
 ***********************************************************************************/
class Animal{
	void bark() {
	System.out.println("DOG barks.");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("DOG eats.");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.bark();
		obj.eat();
	}
}
