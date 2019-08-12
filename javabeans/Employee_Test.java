package capgemini.javabeans;
class Employee{
	// field
	private int empId;
	private String name;
	static int COUNT;

	public Employee() {
		super();
		empId=++COUNT;
	}

	public Employee(String name) {
		super();
		// this.empId=empId;
		// this.name=name;
		setEmpId(empId);
		setName(name);
		empId=++COUNT;
	}
// setter and getter 
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empid) {
		this.empId = empId;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static int getCOUNT() {
				return COUNT;
	}

	
	public String toString1() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public String toString_StringBuilder_Chained() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name).append("]");
		return builder.toString();
	}

	@Override
	public String toString() {
		return String.format("Employee [empId=%s, name=%s]", empId, name);
	}

	

	

	
}

public class Employee_Test {
	public static void main(String[] args) {
		Employee e1, e2, e3;

		e1 = new Employee("ganesh");
		e2 = new Employee("satish");
		e3 = new Employee("kumar");
		System.out.println("EmpId:"+e1.getEmpId() + "\tName:"+e1.getName());
		System.out.println("EmpId:"+e2.getEmpId() + "\tName:"+e2.getName());
		System.out.println("EmpId:"+e3.getEmpId() + "\tName:"+e3.getName());
		System.out.println(Employee.COUNT);
	}
}
