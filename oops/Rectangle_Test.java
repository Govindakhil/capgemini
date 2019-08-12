package capgemini.oops;
class Rectangle 
	{
	//field
	float length,breadth;
	
	//constructor
	public Rectangle()
	{
	length=9.2f;
	breadth=8.6f;
	System.out.println("Rectangle-> def..");	
	}
	
	//constructor parameter
	public Rectangle(float plength,float pbreadth)
	{
		length=plength;
		breadth=pbreadth;
		System.out.println("Rectangle-> parameter");
	}
	
	//method
	public void draw()
	{
		System.out.println("Rectangle is drawn..");
	}
	
	public double calArea() {
		return length*breadth;
	}
	
	// method overriding from parent object class
		@Override // java annotation
		public String toString()
		{
			return"length:"+length+"\tBreadth:"+breadth;	
		}
		
		@Override
		public boolean equals(Object obj) {
			Rectangle otherRectangle = (Rectangle) obj;
			if(this.length == otherRectangle.length && this.breadth == otherRectangle.breadth)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
public class Rectangle_Test 
{
	

	public static void main(String[] args) {
	//declaration
	Rectangle r1,r2;
	
	//object instantiation...
	r1=new Rectangle();
	r2=new Rectangle(5.23f,8.91f);
	
	r1.draw();
	System.out.println("R1 area:"+r1.calArea());
	
	r2.draw();
	System.out.println("R2 area:"+r2.calArea());
	
	System.out.println(r1);
	System.out.println(r2.toString());
		
	}
}
