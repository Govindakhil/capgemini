package capgemini.interfaces;

interface Calculator {
	// by default methods are public and abstract
	int add(int no1, int no2); // no body

	public abstract int sub(int no1, int no2);

	default void definJdk8() {
		System.out.println("I am new feature in JDK 8 called default methods....");
	}
}

interface AdvCalculator {
	int mul(int no1, int no2);

	int div(int no1, int no2);
}

// interfaces are implemented via class
class CalculatorImpl implements Calculator, AdvCalculator {
	// the type CalculatorImpl must implements the inherited abstract method
	// calculator.add(int,int)
	@Override
	public int add(int no1, int no2) {
		return no1 + no2;
	}

	@Override
	public int sub(int no1, int no2) {
		return no1 - no2;
	}

	@Override
	public int mul(int no1, int no2) {
		return no1 * no2;
	}

	@Override
	public int div(int no1, int no2) {
		return no1 / no2;
	}
}

public interface Calculator_Test {
	public static void main(String[] args) {
		Calculator calc;
		AdvCalculator advcalc;
		// cannot instantiate the type calculator
		// calc = new calculator();

		CalculatorImpl calculatorImpl = new CalculatorImpl();
		System.out.println("Add:" + calculatorImpl.add(10, 20));
		System.out.println("Sub:" + calculatorImpl.sub(10, 20));
		System.out.println("Mul:" + calculatorImpl.mul(10, 20));
		System.out.println("Div:" + calculatorImpl.div(10, 20));
		
		//ref pointer...
		//calc = calculatorImpl;
		calc =new CalculatorImpl();
		System.out.println("Add:+"+calc.add(10, 20));
		System.out.println("Sub:" + calc.sub(10, 20));
		//System.out.println("Mul:" + calc.mul(10, 20));
		//System.out.println("Div:" + calc.div(10, 20));
		
		//advcalc = calculatorImpl;
		advcalc =new CalculatorImpl();
		//System.out.println("Add:+"+advcalc.add(10, 20));
		//System.out.println("Sub:" + advcalc.sub(10, 20));
		System.out.println("Mul:" + advcalc.mul(10, 20));
		System.out.println("Div:" + advcalc.div(10, 20));
	}

}
