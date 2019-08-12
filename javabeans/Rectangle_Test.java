package capgemini.javabeans;

public class Rectangle_Test {
	public static void main(String[] args) {

		// declaration
		Rectangle r1, r2;
		// object instantiation
		r1 = new Rectangle();
		r2 = new Rectangle(5.5f, 8.9f);
		System.out.println("breadth:" + r1.getBreadth() + "\tlength:" + r1.getLength());
		System.out.println("r1 Area" + r1.calcArea());
		System.out.println("breadth:" + r2.getBreadth() + "\tlength:" + r2.getLength());
		System.out.println("r2 Area" + r2.calcArea());
		System.out.println(r1.equals(r2));

	}
}
