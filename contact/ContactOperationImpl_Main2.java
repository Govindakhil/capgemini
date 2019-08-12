package capgemini.contact;

import java.util.Scanner;

public class ContactOperationImpl_Main2 {
	
	static Scanner sc= new Scanner(System.in);
	 
	public static String getInput(String message){
		String input;
		System.out.println(message);
		input=sc.next();
		return input;
	}
	public static Contact getContact(){
		Contact contact = null;
		contact = new Contact();
		contact.setFirstName(getInput("Enter First Name:"));
		contact.setLastName(getInput("Enter Last Name:"));
		contact.setEmail(getInput("Enter Email:"));
		contact.setPhoneNo(getInput("Enter the setPhoneNo :"));
		return contact;
		
	}
	public static void main(String[] args) {
		ContactOperation contactOperation=new ContactOperationImpl(3);
		Contact contact =new Contact();
		int choice=0;
		do{
			
			System.out.println("**************************");
			System.out.println("welcome to Contact Book...");
			System.out.println("1.Add Contact");
			System.out.println("2.Delete Contact");
			System.out.println("3.Find Contact");
			System.out.println("4.List ALL");
			System.out.println("5.Exit");
			System.out.println("***************************");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
		switch (choice) {
		case 1:
			contactOperation.addContact(getContact());
			System.out.println("\t\t::=> Contact is created");
			break;
		case 2:
			contactOperation.deleteContact(getInput("Enter Name to Delete: "));
			break;
			
		case 3:
			contact=contactOperation.findContact(getInput("Enter Name to Find:"));
			System.out.println(contact);
			break;
		case 4:
			contactOperation.listALL();
			break;
		}	
	}while(choice !=3);
		sc.close();
}
}
	