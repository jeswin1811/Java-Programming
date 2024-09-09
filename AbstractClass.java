/***********************************************************************************
 *                         Jeswin Thampichan Joseph
 *            Computer Science and Engineering Student, SJCET, Palai
 *                        Email: jeswintj16@gmail.com
 *
 *    Project Title: Abstract Class
 *    Date: 2024-09-09
 *
 *    Description: This is a java program to use an abstract class and abstract method 
 *                 to print the number of sides of a shape.
 ***********************************************************************************/
abstract class Shape{
	abstract void numberOfSides();
}

class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side = side;
	}
	public void numberOfSides() {
		System.out.println("Item Rectangle, number of sides = "+side);
	}
}

class Triangle extends Shape{
	int side;
	Triangle(int side){
		this.side = side;
	}
	public void numberOfSides() {
		System.out.println("Item Triangle, number of sides = "+side);
	}
}

class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side = side;
	}
	public void numberOfSides() {
		System.out.println("Item Hexagon, number of sides = "+side);
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4);
		Triangle t = new Triangle(3);
		Hexagon h = new Hexagon(6);
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}
