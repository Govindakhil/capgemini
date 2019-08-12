package capgemini.oops;

class Circle {

	// field
	float radius;

	// constructors
	public Circle() {
		radius = 1.0f;
		System.out.println("circle ->def ");
	}

	// constructor overloading
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("circle -> parameters");
	}

	// method...
	public void draw() {
		System.out.println("circle is drawn");
	}

	public double calArea() {
		return radius * radius * Math.PI;
	}

	// method overriding from parent object class
	@Override // java annotation
	public String toString() {
		return "Radius:" + radius;
	}
}

public class Circle_Test {

	public static void main(String[] args) {
	//declaration
	Circle c1,c2;
	
	// object instantiation
	c1=new Circle();
	c2=new Circle(5.5f);
	
	c1.draw();
	System.out.println("c1 area:"+c1.calArea());
	
	c2.draw();
	System.out.println("c2 area:"+c2.calArea());
	
	System.out.println(c1);
	System.out.println(c2.toString());
	}
}
