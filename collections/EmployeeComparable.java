package capgemini.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 implements Comparable<Employee1> {
	// field
	private int empId;
	private String name;

	public Employee1(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;

	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
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

	@Override
	public int compareTo(Employee1 otherEmployee) {
		if(empId== otherEmployee.empId) return 0;
		else if (empId > otherEmployee.empId) return 1;
		else return -1;
	}
}

	class NameComparator implements Comparator<Employee1>{
	@Override
	public int compare (Employee1 e1,Employee1 e2)
	{
		if(e1.getName().equals(e2.getName())) return 0;
		else return -1;
	}
	}
	


public class EmployeeComparable {

	public static void main(String[] args) {

		Employee1 e1,e2,e3;
		e1=new Employee1(101,"Chandu");
		e2=new Employee1(102,"Sasank");
		e3=new Employee1(103,"Prasad");
		 Employee1[] emps ={e1,e3,e2};
		 //java.lang.ClassCastException: capgemini.collection.Employee 
		 //cannot
		 Arrays.sort(emps);
		 System.out.println("Array sorted via Arrays.sort: "+Arrays.toString(emps));
		 System.out.println(e1.compareTo(e2));
		 
		 List<Employee1> list = new ArrayList<Employee1>();
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 System.out.println("Size: "+list.size()+"\t"+list);
		 
//		 Collections.sort(list);
//		 System.out.println("ArrayList sorted via Collections.sort:"+list);
		 
		 Collections.sort(list,new NameComparator());
		 System.out.println("ArrayList sorted via collections.sort:"+list);
		 
	}
}
