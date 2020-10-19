package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class ContactApp {

    public static void main(String[] args) throws IOException {
        contactMenuOptions();
    }

    public static void contactMenuOptions() {
        String directoryName = "./src/contacts";
        String fileName = "contacts.txt";

        try {
            Path dataFilePath = ContactMethods.createDirectoryAndFile(directoryName, fileName);
            ContactMethods.viewContacts(dataFilePath);

            Input input = new Input();
            int userInput = input.getInt();
            switch (userInput) {
                case 1:
                    ContactMethods.viewContacts(dataFilePath); //will take in a string of contacts
                    optionsMenu();
                    break;
                case 2:
                    //Line 32 will write to our contacts.txt ContactMethods.addContact()
                    Files.write(dataFilePath, Arrays.asList(ContactMethods.addContact()), StandardOpenOption.APPEND);
                    ContactMethods.viewContacts(dataFilePath);
                    optionsMenu();
                    break;
                case 3:
                    //method to search a contact by name
                    System.out.println("We're sorry, search is not an available feature yet");
                    optionsMenu();
                    break;
                case 4:
                    //method to delete an existing contact
                    System.out.println("We're sorry, delete is not an available feature yet");
                    optionsMenu();
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(1);
            }
        } catch (IOException ex) {
            System.err.println("Cannot create the file.");
            ex.printStackTrace();
        }
    }

    public static void optionsMenu() {
        Input input = new Input();
        System.out.println();
        System.out.println("Would you like to do something else? [Y/N]");
        if (input.yesNo()) {
            System.out.println("Good deal, I'll take you to the menu");
            System.out.println();
            printMenu();
            contactMenuOptions();
        } else {
            System.out.println("Goodbye, see you next time!");
        }
    }

    public static void printMenu(){
        System.out.println("Welcome to your Contact book!");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
    }
}
