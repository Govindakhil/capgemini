package capgemini.javabeans;

public class Shape_Utility {
	// no instace field...
	// no instance methods..
	// All Static fields ONLY..
	// All static methods ONLY..
	public static Rectangle WhoisBiggerOne(Rectangle rectOne, Rectangle rectTwo) {
		if (rectOne.getLength() > rectTwo.getLength())
			return rectOne;
		else
			return rectTwo;

	}

}
