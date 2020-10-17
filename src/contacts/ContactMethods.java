package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContactMethods {

    public static Path createDirectoryAndFile(String directoryName, String fileName) throws IOException {
        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);

        if (Files.notExists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }

        if (!Files.exists(dataFilePath)) {
            Files.createFile(dataFilePath);
        }
        return dataFilePath;
    }
    public static void printMenu(){
        System.out.println("Welcome to your Contact book!");
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
    }

    public static void viewContacts(Path filePath) throws IOException { //will take in a string of contacts
        System.out.println("Name | Phone number\n" +
                "---------------");
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%s\n", fileContents.get(i));
        }
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
