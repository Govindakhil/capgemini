package capgemini.abstracts;
abstract class Shape {
	public Shape() {
		super();	//will call default constructor of Object class...
		System.out.println("Shape->def...");
	}
	public void draw() {
		System.out.println("Shape is drawn..");
	}
	 public abstract double calcArea();
	 
	 @Override
	public String toString() {
		return "Shape->";
	}
		
}
class Circle extends Shape {
	//field...
	float radius;

	//default constructor
	public Circle() {
		super();
		System.out.println("Circle->def");
	}
	
	//param const..
	public Circle(float radius) {
		super();		//will call def const of shape class
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();	//will call draw method from shape class
		System.out.println("Circle is draw..");		
	}
	@Override
	public double calcArea() {
		return radius*radius*Math.PI;
	}
	
	//toString..
	@Override
	public String toString() {
		//super.toString() will call toString from shape class
		return super.toString() + "Circle [radius=" + radius + "]";
	}
	//equals....
	public boolean equals(Object obj)  {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if(Float.floatToIntBits(radius) !=Float.floatToIntBits(other.radius))
			return false;
		return true;
	}
}


public class Test_shape {
	public static void main(String[] args) {
		//Shape shape;
		//shape = new Shape(); // Shape can not be instantiated,it is abstract
		Circle c1 = new Circle ();
		System.out.println("Area :"+c1.calcArea());
		c1.draw();
		
	}

}
