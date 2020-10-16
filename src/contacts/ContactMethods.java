package contacts;

import util.Input;

public class ContactMethods {

    public static void printMenu(){
        System.out.println("Welcome to your Contact book!");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
    }

    public static void viewContacts() { //will take in a string of contacts
        System.out.println("Name | Phone number\n" +
                "---------------");
//        for (String contact : contacts) {
//            System.out.printf("%s");
//        }
    }
    public String addContact(String aName, int aNumber) {
        System.out.println("To add a contact, please enter a name and number: ");
        return "";
    }
    public String searchContact (String aName) {
        return "";
    }
    public String deleteContact(String aName) {
        return "";
    }

}
