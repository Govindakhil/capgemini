package capgemini.contact;

import java.util.Scanner;

public class ContactOperationImpl_Main {
	public static void main(String[] args) {
		ContactOperation contactOperation = new ContactOperationImpl(3);

		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Contact contact=null;
		do {
			System.out.println("welcome to Contact Book...");
			System.out.println("1.Add Contact");
			System.out.println("2.Delete Contact");
			System.out.println("3.Find Contact");
			System.out.println("4.List ALL");
			System.out.println("5.Save ALL");
			System.out.println("6.Restore ALL");
			System.out.println("7.Exit");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				contact = new Contact("Ismart", "Sankar", "sankar123@gmail.com", "96500041256");
				contactOperation.addContact(contact);
				System.out.println("\t\t::=> Contact is created");
				break;
			case 2:
				contactOperation.deleteContact("Ismart");
				break;
				
			case 3:
				contactOperation.findContact("Ismart");
				System.out.println(contact);
				break;
			case 4:
				contactOperation.listALL();
				break;
			case 5:
				break;

			}
		} while (choice != 6);
	}

}
