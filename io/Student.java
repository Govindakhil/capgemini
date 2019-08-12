package capgemini.io;

import java.io.Serializable;

class Student implements Serializable {
	private int rollNo;
	private String name;
	private float marks;
	
		
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [rollNo=").append(rollNo).append(", name=").append(name).append(", marks=")
				.append(marks).append("]");
		return builder.toString();
	}
	
	
	

}
