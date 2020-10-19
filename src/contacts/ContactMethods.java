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

    public static void viewContacts(Path filePath) throws IOException { //will take in a string of contacts
        System.out.println("Name | Phone number\n" +
                "---------------");
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%s\n", fileContents.get(i));
        }
    }

    //addContact
    public static String addContact() {
        System.out.println("To add a contact, please enter a name and number: \n" +
                "ex: name-2101112222");
        Input userInput = new Input();
        String contactName = userInput.getContactName();
        String convertNumber = userInput.getContactNumber();
        ContactInfo newContact = new ContactInfo(contactName, convertNumber);
        return newContact.getName() + " | " + newContact.getNumber();

        //PLAYING WITH LOOPS TO TRY TO ADD IN "-" AT SPECIFIC INDEXES
        //        String contactName = userInput.getContactName();
//        String convertNumber = userInput.getContactNumber();
//        ContactInfo newContact = new ContactInfo(contactName, convertNumber);
//        //format number to have a "-" at the index of 3 & 6
//        String hNumber = newContact.getNumber();
//        char[] ch = hNumber.toCharArray();
//        System.out.println(ch);
//        for (int i = 0; i <= hNumber.length(); i++) {
//            if (i == 2) {
//                System.out.print(ch[i] + "-");
//            }
//            else if (i == 5) {
//                System.out.print(ch[i] + "-");
//            }
//            else {
//                System.out.print(ch[i]);
//            }
    }

    public static void searchContact(Path filePath) throws IOException {
        System.out.println("To start your search, enter a name to search");
        Input input = new Input();
        String searchName = input.getContactName();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            if (fileContents.get(i).startsWith(searchName))
                System.out.printf("%s\n", fileContents.get(i));
        }
    }

    public static void searchDeleteContact(Path filePath) throws IOException {
        System.out.println("Which contact would you like to delete?");
        Input input = new Input();
        String searchName = input.getContactName();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            if (fileContents.get(i).startsWith(searchName))
                System.out.printf("The contact you're trying to delete is: %s\n", fileContents.get(i));
            String extractContact = fileContents.get(i);
        }
        input.confirm();

    }

//    public static void deleteContact(Path path) throws IOException {
//
//        List<String> fileContents = Files.readAllLines(path);
//        for (int i = 0; i < fileContents.size(); i++) {
//            if (fileContents.get(i).startsWith(searchName))
//                System.out.printf("The contact you're trying to delete is: %s\n", fileContents.get(i));
//
//        }
}


