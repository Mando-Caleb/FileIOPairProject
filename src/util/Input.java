package util;

import java.util.Scanner;

import contacts.ContactApp;
import contacts.ContactInfo;

public class Input {
    protected Scanner input;


    public Input(){
        this.input = new Scanner(System.in);
    }

    //modify getInt() so it doesnt input the Strings below
    //refactor getInt() to only get integer for switch case
    //create input method to ask if the user wants to go to the main menu
    public int getInt() {
        System.out.println();
        ContactApp.printMenu();
        System.out.println("\"Enter an option (1, 2, 3, 4 or 5):\"");
        int num;

        try {
            String userInput = input.nextLine();
            num = Integer.parseInt(userInput);
        } catch (RuntimeException rex) {
            System.err.println("You must enter an option between 1-5: ");
            return getInt();
        }
        if (num >= 1 && num <= 5) {
            return num;
        } else {
            System.out.println("Invalid Number.");
            return getInt();
        }
    }

    public String getContactName() {
        System.out.println("Enter a name: ");
        return input.nextLine();
    }
    public String getContactNumber() {
        System.out.println("Enter a number: ");
        return input.nextLine();
    }

    public boolean yesNo() {
        return yesNo("Please enter Yes or No");
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = this.input.nextLine();
        return (userInput.trim().toLowerCase().equals("y") ||
                userInput.trim().toLowerCase().equals("yes"));
    }

    public boolean confirm() {
        return yesNo("Are you sure you would like to delete this file? [Y/N]");
    }
    public boolean confirm(String prompt) {
        System.out.println(prompt);
        String userInput = this.input.nextLine();
        return (userInput.trim().toLowerCase().equals("y") ||
                userInput.trim().toLowerCase().equals("yes"));
    }


}
