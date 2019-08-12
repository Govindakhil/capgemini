package capgemini.javabeans;

import java.util.Scanner;

abstract class Shape {
	public Shape() {
		super();
		System.out.println("Shape->def...");
	}

	public void draw() {
		System.out.println("Shape is drawn..");
	}

	public abstract double calcArea();

	public void showCircle() {
		// TODO Auto-generated method stub

	}
}

class Circle extends Shape {

	// field
	private float radius;

	// setter method
	public void setRadius(float radius) {
		if (radius > 0)
			this.radius = radius;
	}

	// getter method
	public float getRadius() {
		return radius;
	}

	@Override
	public double calcArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		// super.toString() will call toString from shape class
		return super.toString() + "Circle [radius=" + radius + "]";
	}

	// equals....
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Float.floatToIntBits(radius) != Float.floatToIntBits(other.radius))
			return false;
		return true;
	}

	public void showCircle() {
		System.out.println("I am Circle...");
	}

}

class Rectangle1 extends Shape {

	// field
	private float length, breadth;

	// default..
	public Rectangle1() {
		// to call another constructor..
		this(1.0f, 3.0f); // will call param constructor..
		System.out.println("Rectangle->def...");
	}

	public Rectangle1(float length, float breadth) {
		// this.length=length;
		// this.breadth=breadth;
		setLength(length);
		setBreadth(breadth);
		System.out.println("Rectangle->param...");
	}

	// setter method
	public void setLength(float length) {
		if (length > 0)
			this.length = length;
	}

	public void setBreadth(float breadth) {
		if (breadth > 0)
			this.breadth = breadth;
	}

	// getter method
	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	@Override
	public double calcArea() {
		return length * breadth;
	}

	@Override
	public String toString() {
		return "Length:" + getLength() + "\tBreadth:" + getBreadth();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // r1.equals(r1)
			return true;
		if (obj == null) // r1.equals(null)
			return false;
		if (getClass() != obj.getClass()) // r1.equals("abc");
			return false;
		Rectangle other = (Rectangle) obj;
		if (length != other.getLength())
			return false;
		if (breadth != other.getBreadth())
			return false;
		return true;
	}
}

class Triangle extends Shape {

	// field
	private float height, base;

	// default..
	public Triangle() {
		// to call another constructor..
		this(1.0f, 3.0f); // will call param constructor..
		System.out.println("Triangle->def...");
	}

	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}

	public void Traingle(float height, float base) {
		// this.base=base;
		// this.height=height;
		setHeight(height);
		setBase(base);
		System.out.println("Triangle->param...");
	}

	// setter method
	public void setHeight(float height) {
		if (height > 0)
			this.height = height;
	}

	public void setBase(float base) {
		if (base > 0)
			this.base = base;
	}

	// getter method
	public float getHeight() {
		return height;
	}

	public float getBase() {
		return base;
	}

	@Override
	public double calcArea() {
		return 0.5 * height * base;
	}

	@Override
	public String toString() {
		return "Height:" + getHeight() + "\tBase:" + getBase();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // r1.equals(r1)
			return true;
		if (obj == null) // r1.equals(null)
			return false;
		if (getClass() != obj.getClass()) // r1.equals("abc");
			return false;
		Triangle other = (Triangle) obj;
		if (height != other.getHeight())
			return false;
		if (base != other.getBase())
			return false;
		return true;
	}
}

public class Shape_Test {
	private static Scanner sc;

	public static void main(String[] args) {
		int m;
		sc = new Scanner(System.in);
		m = sc.nextInt();
		switch (m) {
		case 1:
			// declaration
			Circle c1 = new Circle();
			c1.draw();
			c1.calcArea();
			c1.showCircle();

			Shape shape = new Circle();
			shape.draw();
			shape.calcArea();

			shape.showCircle();
			break;
		case 2:
			// declaration
			Rectangle r1, r2;
			r1 = new Rectangle();
			r2 = new Rectangle(5.5f, 8.9f);

			System.out.println("breadth:" + r1.getBreadth() + "\tlength:" + r1.getLength());
			System.out.println("r1 Area" + r1.calcArea());
			System.out.println("breadth:" + r2.getBreadth() + "\tlength:" + r2.getLength());
			System.out.println("r2 Area" + r2.calcArea());
			System.out.println(r1.equals(r2));
			break;
		case 3:
			// declaration
			Triangle t1, t2;
			t1 = new Triangle();
			t2 = new Triangle(6.6f, 7.8f);

			System.out.println("base:" + t1.getBase() + "\theight:" + t1.getHeight());
			System.out.println("t1 Area" + t1.calcArea());
			System.out.println("breadth:" + t2.getBase() + "\tlength:" + t2.getHeight());
			System.out.println("t2 Area" + t2.calcArea());
			System.out.println(t1.equals(t2));

		}

	}
}
