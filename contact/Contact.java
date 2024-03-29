package capgemini.contact;

public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;

	public Contact(String firstName, String lastName, String email, String phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public Contact() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", email=").append(email).append(", phoneNo=").append(phoneNo).append("]");
		return builder.toString();
	}

}
