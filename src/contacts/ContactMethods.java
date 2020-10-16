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
        Input input = new Input();
        int userInput = input.getInt();
        System.out.println();
        System.out.println(userInput);
    }

}
