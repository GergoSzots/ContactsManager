
public class ContactManager {

	Contact [] myFriendsList;
	int friendsCount;
	
	public ContactManager() {
		myFriendsList = new Contact[500];
		friendsCount = 0;
	}
	
	public void addContact(Contact contact) {
		myFriendsList[friendsCount] = contact;
		friendsCount++;
	}
	
	public Contact searchContact(String searchName) {
		for(int i = 0; i<friendsCount;i++) {
			if(myFriendsList[i].name.equals(searchName)) {
				return myFriendsList[i];
			}
		}
		return null;
	}

}
