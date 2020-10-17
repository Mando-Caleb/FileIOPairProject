package contacts;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class ContactApp {
    public static void main(String[] args) throws IOException {
        String directoryName = "./src/contacts";
        String fileName = "contacts.txt";

        try {
            Path dataFilePath = ContactMethods.createDirectoryAndFile(directoryName, fileName);

            List<String> contactList = Arrays.asList("caleb | 2102742144", "mando | 2109953867");
            Files.write(dataFilePath, contactList);

            ContactMethods.printMenu();
            Input input = new Input();
            int userInput = input.getInt();

            switch(userInput) {
                case 1:
                    ContactMethods.viewContacts(dataFilePath);  //will take in a string of contacts
                    break;
                case 2:
                ContactMethods.addContact(dataFilePath);
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
        } catch (IOException ex) {
            System.err.println("Cannot create the file.");
            ex.printStackTrace();
        }
    }
}
