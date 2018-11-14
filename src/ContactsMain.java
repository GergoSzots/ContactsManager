
public class ContactsMain {

	public static void main(String[] args) {
		
		ContactManager manager = new ContactManager();
		Contact friend1 = new Contact();
		friend1.name = "Petee";
		friend1.email = "Petee@bestemail.com";
		friend1.phonenumber = "65465456";
		
		Contact friend2 = new Contact();
		friend2.name = "Liz";
		friend2.email = "Lizee@worstemail.com";
		friend2.phonenumber = "65465456";
		
		manager.addContact(friend1);
		manager.addContact(friend2);
		
		Contact searchingResult = manager.searchContact("Petee");
		
		System.out.print(searchingResult.email);
		

	}

}
