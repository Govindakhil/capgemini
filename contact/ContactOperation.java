package capgemini.contact;

public interface ContactOperation {
	
	public void addContact(Contact contact);
	public void deleteContact(String firstName);
	public Contact findContact(String firstName);
	public void listALL();

}
