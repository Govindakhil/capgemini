package capgemini.javabeans;

public class Rectangle {

	// field
	private float length, breadth;

	// default..
	public Rectangle() {
		// to call another constructor..
		this(1.0f, 3.0f); // will call param constructor..
		System.out.println("Rectangle->def...");
	}

	public Rectangle(float length, float breadth) {
		// this.length=length;
		// this.breadth=breadth;
		setLength(length);
		setBreadth(breadth);
		System.out.println("Rectangle->param...");
	}

	// setter mathod....
	public void setLength(float length) {
		if (length > 0)
			this.length = length;
	}

	public void setBreadth(float breadth) {
		if (breadth > 0)
			this.breadth = breadth;
	}

	// getter method..
	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

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

	public static Rectangle WhoisBiggerOne(Rectangle rectOne, Rectangle rectTwo) {
		if (rectOne.getLength() > rectTwo.getLength())
			return rectOne;
		else
			return rectTwo;

	}

	public static void main(String[] args) {
		Rectangle r1, r2;
		r1 = new Rectangle(3.5f, 5.5f);
		r2 = new Rectangle(4.5f, 6.5f);

		Rectangle bigger1 = Rectangle.WhoisBiggerOne(r1, r2);
		Rectangle bigger2 = Rectangle.WhoisBiggerOne(r1, r2);

	}
}
