package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class ContactApp {

    public static void main(String[] args) throws IOException {
        String directoryName = "./src/contacts";
        String fileName = "contacts.txt";

        Path dataFilePath = ContactMethods.createDirectoryAndFile(directoryName, fileName);
        ContactMethods.viewContacts(dataFilePath);

        contactMenuOptions();
    }

    public static void contactMenuOptions() {
        String directoryName = "./src/contacts";
        String fileName = "contacts.txt";

        try {
            Path dataFilePath = ContactMethods.createDirectoryAndFile(directoryName, fileName);

            Input input = new Input();
            System.out.println("------------------------------------");
            System.out.println("Do you want to go to the menu?");
            System.out.println();
            if(input.yesNo()) {
                int userInput = input.getInt();
                switch (userInput) {
                    case 1:
                        ContactMethods.viewContacts(dataFilePath);
                        optionsMenu();
                        break;
                    case 2:
                        Files.write(dataFilePath, Arrays.asList(ContactMethods.addContact()), StandardOpenOption.APPEND);
                        ContactMethods.viewContacts(dataFilePath);
                        optionsMenu();
                        break;
                    case 3:
                        ContactMethods.searchContact(dataFilePath);
                        optionsMenu();
                        break;
                    case 4:
                        ContactMethods.deleteContact(dataFilePath);
                        optionsMenu();
                        break;
                    case 5:
                        System.out.println("Ok, Goodbye!");
                        ContactMethods.pokemon();;
                        System.exit(0);
                }
            }else{
                System.out.println("Okay!, See ya later!");
                ContactMethods.pokemon();
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
