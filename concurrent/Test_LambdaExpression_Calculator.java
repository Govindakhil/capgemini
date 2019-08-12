package capgemini.concurrent;

interface Calculator
{
	 int add(int num1,int num2);
}

public class Test_LambdaExpression_Calculator {
	public static void main(String[] args) {
		Calculator calc0=new Calculator() {
			
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		
			
		Calculator calc1 =(int x,int y) -> {
			return x+y;
	
	};
	
	Calculator calc2 =( x, y) -> {
		return x+y;

};
	System.out.println("Addition "+calc2.add(10,20));
	}
}
