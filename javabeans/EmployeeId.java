package capgemini.javabeans;

class Employee1 {
	// field
	private int empId;
	private String name;
	// static int SEQUENCE;

	public static int SEQUENCE;
	public static int COUNT;

	static {
		SEQUENCE = 100;
		COUNT = 0;
		System.out.println("i am in static block..");
	}

	public Employee1() {
		super();
		empId = ++SEQUENCE;
		COUNT++;
		System.out.println("i am in def constructor..");
	}

	public Employee1(String name) {
		super();
		empId = ++SEQUENCE;
		COUNT++;
		// this.empId=empId;
		// this.name=name;
		setEmpId(empId);
		setName(name);

	}

	// setter and getter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empid) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public String toString1() {
		return String.format("Employee1 [empId=%s, name=%s]", empId, name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee1 [empId=").append(empId).append(", name=").append(name).append("]");
		return builder.toString();
	}

	public String toString_StringBuilder() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee1 [empId=");
		builder.append(empId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}

public class EmployeeId {

	public static final String SEQUENCE = null;
	public static final String COUNT = null;

	public static void main(String[] args) {
		Employee1 e1, e2, e3;

		e1 = new Employee1("ganesh");
		e2 = new Employee1("satish");
		e3 = new Employee1("kumar");
		System.out.println("EmpId:" + e1.getEmpId() + "\tName:" + e1.getName());
		System.out.println("EmpId:" + e2.getEmpId() + "\tName:" + e2.getName());
		System.out.println("EmpId:" + e3.getEmpId() + "\tName:" + e3.getName());
		System.out.println("Total count:" + Employee1.COUNT);
		System.out.println(e1.toString());
		System.out.println(e2.toString1());
		System.out.println(e3.toString_StringBuilder());
	}
}
