package contacts;
import util.Input;

public class ContactApp {
    public static void main(String[] args) {
        ContactMethods.printMenu();
        Input input = new Input();
        int userInput = input.getInt();

        switch(userInput) {
            case 1:
                ContactMethods.viewContacts();  //will take in a string of contacts
                break;
            case 2:
                Input.getContactInfo();
                ContactMethods.addContact()
                break;
            case 3:
                //method to search a contact by name
                break;
            case 4:
                //method to delete an existing contact
                break;
            case 5:
                System.out.println("Goodbye");
                System.exit(1);
        }
    }
}
