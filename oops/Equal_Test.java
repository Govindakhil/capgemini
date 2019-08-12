package capgemini.oops;

public class Equal_Test {
	public static void main(String[] args) {
		String name = "Capgemini";
		String company = new String("Capgemini");

		if (name == company) {
			System.out.println("Your are an employee.");
		} else {
			System.out.println("Your are not an employee.");
		}
		if (name.equals(company)) {
			System.out.println("capgemini->Your are an employee.");
		} else {
			System.out.println("capgemini->Your are not an employee.");
		}
	}

}
