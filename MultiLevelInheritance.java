package oopsjava;
/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Multilevel Inheritance
 *    Date: 2024-08-26
 *
 *    Description: This is a java program to show how Multilevel inheritance can be 
 *                 achieved.
 ***********************************************************************************/
class Animals{
	void eats() {
		System.out.println("eating...");
	}
}
class Cats extends Animals{
	void barks() {
		System.out.println("barking...");
	}
}
class Kitten extends Cats{
	void weeps() {
		System.out.println("weeping...");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Kitten d = new Kitten();
		d.eats();
		d.barks();
		d.weeps();
	}
}
