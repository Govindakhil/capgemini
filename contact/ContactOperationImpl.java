package capgemini.contact;

import java.util.Arrays;

public class ContactOperationImpl implements ContactOperation {
	Contact[] contacts;

	public ContactOperationImpl(int size) {
		super();
		contacts = new Contact[size];
	}

	@Override
	public void addContact(Contact contact) {
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index] == null) {
				contacts[index] = contact;
				break;
			}
		}
	}

	@Override
	public void listALL() {
		System.out.println(Arrays.toString(contacts));
	}

	@Override
	public void deleteContact(String firstName) {
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index]!=null &&
					contacts[index].getFirstName().equals(firstName)) {
				contacts[index] = null;
				break;
			}
		}		
	}

	@Override
	public Contact findContact(String firstName) {
		Contact contact = null;
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index]!=null &&
					contacts[index].getFirstName().equals(firstName)) {
				contact  = contacts[index] ;
				break;
			}
		}return contact;		
	}
}
