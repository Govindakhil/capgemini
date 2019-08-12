package capgemini.generics;

import java.util.ArrayList;
import java.util.List;

class PreGenerics {
			private Object t;

		public Object get() {
			return t;
		}

		public void set(Object t) {
			this.t = t;
		}

		public static void main(String[] args) {
			PreGenerics type = new PreGenerics();
			type.set("Pankaj");
			String str = (String) type.get(); // type casting, error prone and
												// can
			System.out.println(str);
			type.set(1);
			int num = (int) type.get();
			System.out.println(num);
		}
	}

class GenericsType<T>{
private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t){
		this.t=t;
	}
	public static void main(String[] args) {
		GenericsType type =new GenericsType();
		type.set("Pankaj");	//valid
		type.set(10);	//valid and autoboxing support
		
		GenericsType<String> type2 =new GenericsType<String>();
		type2.set("Pankaj"); //valid
		
		String str = type2.get();
		System.out.println(str);
	}

}
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape {
	void draw(){
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape {
	void draw(){
		System.out.println("drawing circle");
	}
}

class GenericTest{
	//creating a method that accepts only child class of shape
	public static void drawShapes(List<? extends Shape> lists){
		for(Shape shape:lists){
			shape.draw(); //calling method of shape class by child class 
		}
	}
	
	public static void main(String[] args) {
		List<Rectangle> listRectangle = new ArrayList<Rectangle>();
		listRectangle.add(new Rectangle());
		
		List<Circle> listCircle = new ArrayList<Circle>();
		listCircle.add(new Circle());
		
		drawShapes(listRectangle);
		drawShapes(listCircle);
		
		
	}
}
public class Test_Generics{
	public static void main(String[] args) {
		//Pregenerics.main(new String[0]);
		GenericTest.main(new String[0]);
	}
}

/*
 * JAVA Generic Type
 * E-Elements (used Extensively by the JAVA Collections Framework for example
 * K-Key(Used in Map)
 * N-Number
 * T-Type
 * V-value(Used in Map)
 * S,U,V,etc,-2nd,3rd,4th types 
 */



