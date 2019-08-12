package capgemini.oops;

class Student {
	// field
	int rollNo;
	String name;
	float marks;
	final float OUT_OF_MARKS = 300;

	// constructor
	public Student(int prollNo, String pname, float pmarks) {
		rollNo = prollNo;
		name = pname;
		marks = pmarks;
	}

	// method
	public void display() {
		System.out.println("RollNo:" + rollNo + "\nName:" + name + "\nMarks:" + marks);
	}

	public String calcGrade() {
		double percentage = calcPercentage();
		if (percentage > 85)
			return "Grade A";
		else if (percentage > 70 && percentage < 85)
			return "Grade B";
		else if (percentage > 60 && percentage < 70)
			return "Grade C";
		else
			return "Grade D";
	}

	public double calcPercentage() {
		double Percentage = (this.marks / 300) * 100;
		return Percentage;
	}

	// override
	@Override
	public String toString() {
		return "RollNo" + rollNo + "Name" + name + "Marks" + marks;
	}

	@Override
	public boolean equals(Object obj) {
		Student d = (Student) obj;
		if (this.marks == d.marks) {
			return true;
		} else {
			return false;
		}
	}

}

public class Student_Test {
	public static void main(String[] args) {
		// declaration
		Student s1, s2, s3;

		// object instantiation...
		s1 = new Student(1, "suresh", 250.8f);
		s2 = new Student(2, "hari", 264.9f);
		s3 = new Student(3, "sai", 289.9f);

		s1.display();
		double percentage1 = s1.calcPercentage();
		System.out.println("percentage" + percentage1);
		System.out.println(s1.calcGrade());
		System.out.println(s1.toString());

		s2.display();
		double percentage2 = s2.calcPercentage();
		System.out.println("percentage" + percentage2);
		System.out.println(s2.calcGrade());
		System.out.println(s2.toString());

		s3.display();
		double percentage3 = s3.calcPercentage();
		System.out.println("percentage" + percentage3);
		System.out.println(s3.calcGrade());
		System.out.println(s3.toString());

		System.out.println(s1.equals(s2));
	}
}
